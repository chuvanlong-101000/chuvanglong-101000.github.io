package buoi1;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class Repo {
    ArrayList<Person> list ;
    public Repo() {
        list = new ArrayList<Person>();
        list.add(new Person("Long", "Việt Nam" , 21));
        list.add(new Person("Nam", "Thái Lan" , 14));
        list.add(new Person("Hoàng", "USA" , 24));
        list.add(new Person("Dũng", "Việt Nam" , 26));
        list.add(new Person("Trường", "Nga" , 45));
        list.add(new Person("Toàn", "Ý" , 21));
        list.add(new Person("Trung", "Việt Nam" , 56));
        list.add(new Person("Cường", "Pháp" , 41));
    }

    public void getPersonbyAge() {
        list.stream()
        .filter(p -> p.getAge() > 20 && p.getAge() < 30)
        .forEach(p -> System.out.println(p));
    }

    public void AvgAge(){
        System.out.println(
            list.stream()
            .collect(Collectors.averagingInt(Person::getAge))
        );
    }

    public void AvgNationality() {
        System.out.println(
            list.stream()
            .collect(Collectors
            .groupingBy(Person::getNationality
            ,Collectors.averagingInt(Person::getAge)))
        );
    }
}
