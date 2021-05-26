package com.sk.spring.rest.controller;

import java.util.List;
import com.sk.spring.rest.dao.Books;
import com.sk.spring.rest.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookService bookSvc;

    @GetMapping("/books/{bookId}")
    List<Books> getbookDetails(@PathVariable String bookId) {
        String bookID = bookId;
        System.out.println("SK: controller: bookID: "+bookID);
        List<Books> books = bookSvc.getBooksById(bookID);
        System.out.println("SK: controller: Books: "+books);
        return books;
    }
}
