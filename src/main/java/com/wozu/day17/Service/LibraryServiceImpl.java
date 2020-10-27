package com.wozu.day17.Service;

import com.wozu.day17.Models.Library;
import com.wozu.day17.Repository.LibraryRepo;
import org.springframework.stereotype.Service;

@Service
public class LibraryServiceImpl implements LibraryService {

    private LibraryRepo libraryRepo;

    public LibraryServiceImpl(LibraryRepo libraryRepo){
        this.libraryRepo = libraryRepo;
    }

    @Override
    public Iterable<Library> getAll() {
        return libraryRepo.findAll();
    }

}
