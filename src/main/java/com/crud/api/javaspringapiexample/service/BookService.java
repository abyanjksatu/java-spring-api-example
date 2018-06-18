package com.crud.api.javaspringapiexample.service;

import com.crud.api.javaspringapiexample.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    public List<Book> constructBookList (){
        List<Book> bookList = new ArrayList<>();

        Book book1 = new Book();
        book1.setId(1);
        book1.setIsbn("1212-2121213");
        book1.setTitle("Belajar Spring Framework");
        book1.setAuthor("Oliver Blue");
        bookList.add(book1);

        Book book2 = new Book();
        book2.setId(2);
        book2.setIsbn("3523-212123");
        book2.setTitle("Go Lang Rest API");
        book2.setAuthor("Jonas Manhattan");
        bookList.add(book2);

        return bookList;
    }
}
