package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService_Exercise2;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        System.out.println("Initializing Spring Container...");
        
        // Load context configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_Exercise2.xml");
        
        System.out.println("Spring Container Initialized successfully!");

        // Retrieve the fully wired BookService bean
        BookService_Exercise2 bookService = (BookService_Exercise2) context.getBean("bookService");

        // Execute service method
        bookService.addBook();
    }
}