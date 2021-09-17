package com.example.buoi2.model;

public class Book {

    @Override
    public String toString() {
        return "Book [description=" + description + ", id=" + id + ", title=" + title + "]";
    }
    public Book(){}
    public Book(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    int id ;
    String title ;
    String description ;
}
