package btmap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Repo {
     List<Person> persons = new ArrayList<Person>(List.of(new Person("Long ", 15 , "Hưng Yên"),
     new Person("NAm ", 50 , "Hanoi"),
     new Person("Nữ ", 50 , "Hanoi"),
     new Person("A ", 56 , "loli"),
     new Person("A ", 56 , "loli"),
     new Person("B ", 25 , "Hcmi"),
     new Person("c ", 54 , "Camau"),
    new Person("d ", 54 , "Camau"),
    new Person("Trang", 18 ,"Hưng Yên"),
     new Person("Hoa", 18 ,"Hưng Yên")));

    public void show() {
        //for (Person person : persons) {
            //System.out.println(person);
        //}
        //persons.stream().forEach(person -> System.out.println(person));
    }
    public void CountPersonbyCountry() {
       // persons.stream()
       // .filter(person -> person.getCountry()== "Hưng Yên")
       // .forEach(person -> System.out.println(person));
      /* Map<String, Integer> country = new HashMap < String ,Integer > ();
       for (Person person : persons) {
           country.put(person.getCountry(),0);
       }
       for (Person person : persons) {
            int count = country.get(person.getCountry());
            if(count == 0) {
               country.put(person.getCountry(),1);
            }
            else {
                country.put(person.getCountry(),count+1);
            }
       }
       for(Map.Entry<String, Integer> entry : country.entrySet()) {
           System.out.println(entry.getKey() + "=" + entry.getValue());
       }*/
       Map<String, Long> country = persons.stream().collect(Collectors.groupingBy(Person::getCountry,Collectors.counting()));
       System.out.println(country);
       //persons.stream().sorted();
       //country.stream().sorted();
    }
    public void Sapxep() {
        Map<String, Long> country = persons.stream().collect(Collectors.groupingBy(Person::getCountry,Collectors.counting()));
        List<Map.Entry<String, Long>>  list = new ArrayList<Map.Entry<String, Long>>();
        for (Map.Entry<String, Long> entry : country.entrySet()) {
            list.add(entry);
        }
        //list.sort((p1,p2) -> p1.getKey().compareTo(p2.getKey()));
        list.sort((p1,p2) -> p1.getValue() < p2.getValue() ? 1: -1);
        //list.stream().sorted(Comparator.comparing(Map.Entry::getKey));
        for (Map.Entry<String,Long> entry : list) {
            System.out.println(entry+" , ");
        }

    }
}
