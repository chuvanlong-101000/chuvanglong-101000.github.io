package com.example.demo.Model;

public class Film {
    @Override
    public String toString() {
        return "Film [name=" + name + ", tacgia=" + tacgia + ", year=" + year + "]";
    }


    public Film(String name, String tacgia, int year) {
        this.name = name;
        this.tacgia = tacgia;
        this.year = year;
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
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    String name ;
    String tacgia;
    int year;
}
