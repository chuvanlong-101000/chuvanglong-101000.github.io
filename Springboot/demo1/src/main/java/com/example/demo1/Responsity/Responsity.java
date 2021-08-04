package com.example.demo1.Responsity;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.demo1.Model.Person;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import jdk.jshell.spi.ExecutionControl.InternalException;
@Repository
public class Responsity {

    ArrayList<Person> persons = new ArrayList<Person>();
    public Responsity() {
        /*try {
            File file = ResourceUtils.getFile("classpath:static/person.json");
            ObjectMapper mapper = new ObjectMapper();
            persons.addAll(mapper.readValue(file, new TypeReference<List<Person>>(){}));
            persons.forEach(System.out::println);
          } catch (IOException e) {
            System.out.println(e.getMessage());
          }
          */
          Gson gson = new Gson();
        try {
           FileReader file= new FileReader("C:\\Users\\long_pc\\Desktop\\JAVAWEB04\\Springboot\\demo1\\src\\main\\resources\\static\\person.json");
           people = new Gson().fromJson(file, new TypeToken<List<Person>>() {}.getType());
           people.forEach(System.out::println);
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
    public List<Person> getPersons() {
        return persons ;
    }
}
