package com.kodilla.patterns.adapter.bookclassifier;

import com.kodilla.patterns.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("author1","title1",2000,"signature1"));
        bookSet.add(new Book("author1","title1",2009,"signature1"));
        bookSet.add(new Book("author1","title1",2010,"signature1"));
        bookSet.add(new Book("author1","title1",2020,"signature1"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int mediana = medianAdapter.publicationYearMedian(bookSet);
        //Then
        Assertions.assertEquals(2010,mediana);
    }
}
