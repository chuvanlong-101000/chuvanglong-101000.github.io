package com.example.demo1.controller;


import java.util.List;

import com.example.demo1.Model.Person;
import com.example.demo1.Responsity.Responsity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class Controller {
    @Autowired private Responsity personRepo;
    @GetMapping("people")
        public ResponseEntity<List<Person>> getAllPeople() {
            return ResponseEntity.ok().body(personRepo.getPersons());
        }
}
