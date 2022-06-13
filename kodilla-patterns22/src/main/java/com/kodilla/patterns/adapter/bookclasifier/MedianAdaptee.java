package com.kodilla.patterns.adapter.bookclasifier;

import com.kodilla.patterns.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    private final Statistics statistics = new Statistics();

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics theProcessor = new Statistics();
        return theProcessor.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics theProcessor = new Statistics();
        return theProcessor.medianPublicationYear(books);
    }
}
