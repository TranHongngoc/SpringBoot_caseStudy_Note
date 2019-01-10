package com.codegym.casestudy.service;

import com.codegym.casestudy.model.Notes;
import com.codegym.casestudy.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public Iterable<Notes> findAll() {
        return noteRepository.findAll();
    }


    @Override
    public Notes findbyId(Long id) {
        return noteRepository.findById(id).get();
    }

    @Override
    public void save(Notes notes) {
        noteRepository.save(notes);
    }

    @Override
    public void remove(Long id) {
        noteRepository.deleteById(id);
    }


}
