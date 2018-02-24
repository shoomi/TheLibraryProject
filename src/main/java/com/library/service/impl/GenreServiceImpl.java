package com.library.service.impl;

import com.library.entity.Genre;
import com.library.repository.GenreRepository;
import com.library.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreServiceImpl extends CrudServiceImpl <Genre, Integer, GenreRepository> implements GenreService{

    @Autowired
    private GenreRepository genreRepository;
    @Override
    public GenreRepository getRepository() {
        return genreRepository;
    }
}
