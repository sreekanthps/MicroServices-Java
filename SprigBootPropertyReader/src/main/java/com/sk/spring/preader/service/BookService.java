package com.sk.spring.preader.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BookService {
    @Value("${com.sk.bookdescription}")
    private String bookDescription;

    @Value("${com.sk.bookid}")
    private int[] bookidArray;

    @Value("${com.sk.bookprice}")
    private List<Integer> bookpriceList;

    @Value("${com.sk.bookname}")
    private Set<String> booknameSet;

    @Value("#{${com.sk.bookwithprice}}")
    private Map<String,Integer> bookvalue;

    @Value("${com.sk.bookflag}")
    private boolean bookflag;

    public void getfromProperties() {

        System.out.println("SK: bookDescription: "+bookDescription);
        System.out.println("SK: bookidArray: "+bookidArray);
        System.out.println("SK: bookibookpriceListdArray: "+bookpriceList);
        System.out.println("SK: booknameSet: "+booknameSet);
        System.out.println("SK: bookvalue: "+bookvalue);
        System.out.println("SK: bookflag: "+bookflag);
    }
    
}
