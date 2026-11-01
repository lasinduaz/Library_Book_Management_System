package com.example.Library_Book_Management_System.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="book")
public class BookStatus {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message =  "Title can not be empty")
    private String title;

    @NotBlank (message = "Author can not be empty")
    private String author;

    @NotBlank (message = "ISBN can not be empty")
    private String isbn;

    @NotBlank (message = "category can not be empty")
    private String category;

    @NotBlank (message = "Publish year can can not be empty")
    private String publishYear;

    @NotBlank (message = "Number of copies can not be empty")
    @Min(value = 0)
    private int copies; 

    @NotBlank (message = "Status can not be empty")
    private String status;

}
