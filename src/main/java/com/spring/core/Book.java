package com.spring.core;

public class Book {
   private int bookid;
   private String bookname;
   
   public Book(int bookid, String bookname) {    //constructor injection
	   this.bookid=bookid;
	   this.bookname=bookname;
   }
   public Book() {}
   
   public String toString() {
	   return bookid + " "+bookname;
   }
}
