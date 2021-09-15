package com.example.demo1.Model;

import lombok.Data;


public class Person {
    @Override
    public String toString() {
        return "Person [city=" + city + ", country=" + country + ", job=" + job + ", name=" + name + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    String name ;
    String country;
    String city ;
    String job ;
}
