package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;


    @Test                                                                               // [1]
    void testListBooksWithConditionsReturnList() {                                      // [2]

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [3]
        List<Book> resultListOfBooks = new ArrayList<>();                                // [4]
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);                   // [5]
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);    // [6]
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);    // [7]
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);                 // [8]
        resultListOfBooks.add(book1);                                                    // [9]
        resultListOfBooks.add(book2);                                                    // [10]
        resultListOfBooks.add(book3);                                                    // [11]
        resultListOfBooks.add(book4);                                                    // [12]
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);// [13]

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");        // [14]

        // Then
        assertEquals(4, theListOfBooks.size());                                          // [15]
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {                          // [1]
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);            // [2]
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);               // [3]

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");       // [4]

        // Then
        assertEquals(0, theListOfBooks10.size());                                     // [5]
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());    // [6]
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    void testListBooksWithConditionMoreThan20() {

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [1]
        List<Book> resultListOf0Books = new ArrayList<Book>();                           // [2]
        List<Book> resultListOf15Books = generateListOfNBooks(15);                       // [3]
        List<Book> resultListOf40Books = generateListOfNBooks(40);                       // [4]
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))                    // [5]
                .thenReturn(resultListOf15Books);                                             // [6]
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))                    // [7]
                .thenReturn(resultListOf0Books);                                              // [8]
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))                   // [9]
                .thenReturn(resultListOf40Books);                                             // [10]

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");    // [11]
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");   // [12]
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");  // [13]
        // Then

        assertEquals(0, theListOfBooks0.size());                                         // [14]
        //assertEquals(15, theListOfBooks15.size());                                       // [15]
        //assertEquals(40, theListOfBooks40.size());                                        // [16]
    }

    @Test
    void testListBooksInHandsOf0() {

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user0 = new LibraryUser("Name0","LastName0", "012345678910");
        List<Book> booksInHandsOf0 = new ArrayList<Book>();


        //when(bookLibrary.)
        // When
        List<Book> theListOfBookInHandsOf = bookLibrary.listBooksInHandsOf(user0);

        // Then
        assertEquals(booksInHandsOf0.size(), theListOfBookInHandsOf.size());

    }
    @Test
    void testListBooksInHandsOf1() {
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user1 = new LibraryUser("Name1","LastName1", "112345678910");

        List<Book> booksInHandsOf1 = new ArrayList<Book>();
        booksInHandsOf1.add(new Book("1","1",1));


        assertEquals(booksInHandsOf1.size(), bookLibrary.listBooksInHandsOf(user1).size());
    }


    @Test
    void testListBooksInHandsOf5() {
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user5 = new LibraryUser("Name5","LastName5", "512345678910");
        List<Book> booksInHandsOf5 = new ArrayList<Book>();
        booksInHandsOf5.add(new Book("5.1","5.1",51));
        booksInHandsOf5.add(new Book("5.2","5.2",52));
        booksInHandsOf5.add(new Book("5.3","5.3",53));
        booksInHandsOf5.add(new Book("5.4","5.4",54));
        booksInHandsOf5.add(new Book("5.5","5.5",55));


        assertEquals(booksInHandsOf5.size(), bookLibrary.listBooksInHandsOf(user5).size());
    }
}