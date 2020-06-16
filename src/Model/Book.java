/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.InputStream;
import java.util.Date;

/**
 *
 * @author Samuel
 */
public class Book {
    
    private Long id;
    private String name;
    private String genre;
    private String author;
    private String publisher;
    private String stock;
    private ImageFile Image;
    private Date acquired;

    public Book(Long id, String name, String genre, String author, String publisher, String stock, ImageFile Image, Date acquired) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.author = author;
        this.publisher = publisher;
        this.stock = stock;
        this.Image = Image;
        this.acquired = acquired;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public ImageFile getImage() {
        return Image;
    }

    public void setImage(ImageFile Image) {
        this.Image = Image;
    }
    
    public void setImage(InputStream inputS) {
        this.Image = new ImageFile(inputS, name);
    }
}
