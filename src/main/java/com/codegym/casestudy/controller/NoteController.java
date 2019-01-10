package com.codegym.casestudy.controller;

import com.codegym.casestudy.model.Notes;
import com.codegym.casestudy.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping
public class NoteController {

    @Autowired
    private NoteService noteService;

    @GetMapping("/notes")
    public ModelAndView listNotes(){
        Iterable<Notes> notes = noteService.findAll();
        ModelAndView modelAndView = new ModelAndView("/note/list");
        modelAndView.addObject("notes",notes);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView createNote(){
        ModelAndView modelAndView = new ModelAndView("/note/create");
        modelAndView.addObject("notes",new Notes());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView saveNote(@ModelAttribute("note") Notes notes){
        noteService.save(notes);

        ModelAndView modelAndView = new ModelAndView("/note/create");
        modelAndView.addObject("notes",notes);
        modelAndView.addObject("message","New Note created sucessfully");
        return modelAndView;
    }
}
