package com.sk.spring.rest.dao;

public class Books {
    int bookId;
    String bookName;
    int bookValue;

    public Books(int bookId, String bookName, int bookValue) {
        super();
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookValue = bookValue;
    }

    public int getBookId() {
        return this.bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookValue() {
        return this.bookValue;
    }

    public void setBookValue(int bookValue) {
        this.bookValue = bookValue;
    }

    @Override
    public String toString() {
        return "{" +
            " bookId='" + getBookId() + "'" +
            ", bookName='" + getBookName() + "'" +
            ", bookValue='" + getBookValue() + "'" +
            "}";
    }
    
}
