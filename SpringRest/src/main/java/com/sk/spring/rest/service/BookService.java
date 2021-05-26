package com.sk.spring.rest.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sk.spring.rest.dao.Books;

import org.springframework.stereotype.Component;
@Component
public class BookService {

    Map<String,Books> books = new HashMap<String, Books>();
    List<Books> response = new ArrayList<Books>();
    public List<Books> getBooksById(String bookId) {
        String bookID = bookId;
        System.out.println("SK: service: bookID: "+bookID);
        Map<String,Books> booksMap =  bookData();
        System.out.println("SK: service: booksMap: "+booksMap);
        Set<String> key = booksMap.keySet();
        Iterator<String> itr= key.iterator();
        Books book = null;
        while(itr.hasNext()) {
            String mapkey = (String)itr.next();
            if(mapkey.equals(bookID)){
                book = booksMap.get(mapkey);
                response.add(book);
            }
        }
        System.out.println("SK: service: response: "+response);
        return response;
    }
    
    public Map<String, Books> bookData() {
        books.put("1", new Books(100,"JAVA",100));
        books.put("2", new Books(200,"PYTHON",100));
        books.put("3", new Books(300,"SWIFT",300));
        books.put("4", new Books(400,"Objective-C",400));
        books.put("5", new Books(500,"Golang",500));
        books.put("6", new Books(600,"R",100));
        books.put("7", new Books(700,"SCALA",100));
        books.put("8", new Books(800,"GRUVY",100));
        books.put("9", new Books(900,"PASCAL",100));
        books.put("10", new Books(0,"UNKNOWN",100));
        return books;

    }

    
}
