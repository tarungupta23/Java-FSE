package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class MainApp {
    public static void main(String[] args) {
        // 1. Load the Spring application context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. Retrieve the BookService bean managed by Spring
        BookService bookService = (BookService) context.getBean("bookService");

        // 3. Test the setup
        bookService.addBook();
    }
}