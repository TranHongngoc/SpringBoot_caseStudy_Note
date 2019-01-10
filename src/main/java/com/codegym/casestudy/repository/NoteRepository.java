package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.Notes;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface NoteRepository extends PagingAndSortingRepository<Notes,Long> {

}
