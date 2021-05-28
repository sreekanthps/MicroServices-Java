package com.sk.spring.preader.controller;

import com.sk.spring.preader.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookService bookSvc;
    @GetMapping("/books")
    public void getBookInfo() {
        System.out.println("*************************");
        bookSvc.getfromProperties();
        System.out.println("*************************"); 
    }
}
