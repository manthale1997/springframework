package com.spring.core;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryTest {
	
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("Library.xml");
	Library lib = (Library) context.getBean("lib");
	List <Book> books=lib.getBooks();
	for (Book b: books)
		System.out.println(b);
}
	
}
