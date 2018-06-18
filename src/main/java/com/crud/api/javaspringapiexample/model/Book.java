package com.crud.api.javaspringapiexample.model;

import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;

@Data
public class Book {

    @Id
    @Generated
    private Integer id;
    private String isbn;
    private String title;
    private String author;
}
