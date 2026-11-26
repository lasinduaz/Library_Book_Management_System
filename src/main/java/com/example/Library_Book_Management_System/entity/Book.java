package com.example.Library_Book_Management_System.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String author;

    @Column (nullable = false, unique = true)
    private String title;

    @Column (nullable = false)
    private String category;

    private Integer publishedYear;

    @Column(nullable = false)
    private Integer numberOfCopies;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BookStatus status = BookStatus.AVAILABLE;


    // retrieve data form

    public long setId()
    {
        return  id;
    }
    public void getId(Long id)
    {
        this.id = id;
    }
    public String setanthor ()
    {
        return author;
    }
    public void getanthor (String author)
    {
        this.author = author;
    }
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public Integer getPublishedYear() { return publishedYear; }
    public void setPublishedYear(Integer publishedYear) { this.publishedYear = publishedYear; }

    public Integer getNumberOfCopies() { return numberOfCopies; }
    public void setNumberOfCopies(Integer numberOfCopies) { this.numberOfCopies = numberOfCopies; }

    public BookStatus getStatus() { return status; }
    public void setStatus(BookStatus status) { this.status = status; }

}
