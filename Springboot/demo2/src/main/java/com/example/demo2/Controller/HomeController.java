package com.example.demo2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import com.example.demo2.model.Person;
import com.example.demo2.Reponsitory.PersonReponsitory;

@RestController
@RequestMapping("/api")
public class HomeController {
    @Autowired
    private PersonReponsitory personRepo;

    @GetMapping("/long")

    public List<Person> getAllPeople() {
      return personRepo.getAll();
    }

  @GetMapping("/count")
  public Map<String, Integer> countPeopleByNationality() {
    return personRepo.countPeopleByNationality();
  }

  @GetMapping("/count3")
  public List<Map.Entry<String, Long>> countPeopleByNationality3() {
    return personRepo.countPeopleByNationality3();
  }
}
