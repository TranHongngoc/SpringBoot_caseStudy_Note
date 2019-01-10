package com.codegym.casestudy.service;

import com.codegym.casestudy.model.Notes;

public interface NoteService {
    Iterable<Notes> findAll();
    Notes findbyId(Long id);
    void save(Notes notes);
    void remove(Long id);
}
