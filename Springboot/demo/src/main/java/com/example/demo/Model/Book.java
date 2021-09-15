package com.example.demo.Model;

public class Book {
    
    public Book(String name, String tacgia) {
        this.name = name;
        this.tacgia = tacgia;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTacgia() {
        return tacgia;
    }
    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }
    String name ;
    String tacgia ;
}
