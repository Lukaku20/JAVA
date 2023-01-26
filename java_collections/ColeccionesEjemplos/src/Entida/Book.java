/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entida;

import java.util.Date;

/**
 *
 * @author lukaku20
 */
public class Book {
    
    int id;
    String name;
    String author;
    int year;
    String wordsX;

    public Book() {
    }
    
    public Book(int id, String name, String author, int year, String wordsX) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
        this.wordsX = wordsX;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getWordsX() {
        return wordsX;
    }

    public void setWordsX(String wordsX) {
        this.wordsX = wordsX;
    }

  


    @Override
    public String toString() {
        return "| Book: " + id + "| name= " + name + "| author= " + author + "\n"+
                "| year= " + year + "| keywords= " + wordsX + '|';
    }
    
}
