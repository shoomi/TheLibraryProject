package com.library.entity.buider.authorbuilder;

import com.library.entity.Author;
import com.library.entity.buider.ClassBuilder;

public abstract class AuthorBuilder implements ClassBuilder<Author> {

    public Author author;

    public void createNewAuthor() {
        author = new Author();
    }
}
