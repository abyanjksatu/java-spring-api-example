package com.crud.api.javaspringapiexample.controller;

import com.crud.api.javaspringapiexample.model.Book;
import com.crud.api.javaspringapiexample.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    //TODO : http://localhost:8080/book
    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public ResponseEntity<List<Book>> getAllBook(
            @RequestHeader(value = "Accept", defaultValue="application/json") String acceptHeader) {
        List<Book> bookList = bookService.constructBookList();
        return new ResponseEntity<List<Book>>(bookList, HttpStatus.OK);
    }

    //TODO : http://localhost:8080/book/{id}
    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public ResponseEntity<Book> getBookById(
            @RequestHeader(value = "Accept", defaultValue="application/json") String acceptHeader,
            @PathVariable("id") int id) {
        List<Book> bookList = bookService.constructBookList();
        Book bookResult = null;
        for (Book book: bookList) {
            if (book.getId() == id) {
                bookResult = book;
                break;
            }
        }
        return new ResponseEntity<Book>(bookResult, HttpStatus.OK);
    }
}
