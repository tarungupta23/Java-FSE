package com.library.service;

import com.library.repository.BookRepository;

public class BookService_Exercise2 {
    // 1. Define the dependency field
    private BookRepository bookRepository;

    // 2. Provide a public setter method for Spring's DI container
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Dependency Injection successful: BookRepository injected into BookService!");
    }

    public void addBook() {
        System.out.println("BookService: Delegating book addition to the repository...");
        bookRepository.mockSave();
    }
}