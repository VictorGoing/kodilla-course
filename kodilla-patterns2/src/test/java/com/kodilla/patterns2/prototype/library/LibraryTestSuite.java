package com.kodilla.patterns2.prototype.library;

import com.kodilla.patterns2.prototype.Board;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //W teście stwórz obiekt biblioteki oraz kilka obiektów książek i dodaj je do księgozbioru.
        Library library = new Library("biblioteka");
        library.getBooks().add(new Book("Title1","Author1", LocalDate.of(2001,1,1)));
        library.getBooks().add(new Book("Title2","Author2", LocalDate.of(2002,2,2)));
        library.getBooks().add(new Book("Title3","Author3", LocalDate.of(2003,3,3)));


        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().add(new Book("Title4","Author4", LocalDate.of(2004,4,4)));



        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(4, library.getBooks().size());
        assertEquals(4, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());

    }

}
