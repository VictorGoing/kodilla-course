package com.kodilla.patterns2.prototype.library;

import com.kodilla.patterns2.prototype.Board;
import com.kodilla.patterns2.prototype.Prototype;
import com.kodilla.patterns2.prototype.Task;
import com.kodilla.patterns2.prototype.TasksList;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }


    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }



    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for(Book book: books)
            clonedLibrary.getBooks().add(book);

        return clonedLibrary;
    }
}
