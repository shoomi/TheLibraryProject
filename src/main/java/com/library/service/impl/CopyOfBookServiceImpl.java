package com.library.service.impl;

import com.library.entity.CopyOfBook;
import com.library.repository.CopyOfBookRepository;
import com.library.service.CopyOfBookServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CopyOfBookServiceImpl extends CrudServiceImpl <CopyOfBook, Integer, CopyOfBookRepository> implements CopyOfBookServise{

    @Autowired
    private CopyOfBookRepository cRepository;
    @Override
    public CopyOfBookRepository getRepository() {
        return cRepository;
    }
}