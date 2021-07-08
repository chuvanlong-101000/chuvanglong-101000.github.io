import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
public class App {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(1,"Long",LocalDate.of(2000, 12,01),"Hưng Yên",031656111465,"vanlong@gmail.com",100000000L);
        Teacher t2 = new Teacher(2,"Trang",LocalDate.of(2000, 10,06),"Hưng Yên",031656111465,"thutrang@gmail.com",100000000L);
        Student s1 = new Student(1,"Duy",LocalDate.of(2000, 10,20),"tp Hồ Chí Minh",035161214666,"duy01@gmail.com",10.0);
        Student s2 = new Student(2,"Tân",LocalDate.of(2000,12,20),"Hà nội",035161214666,"tan0201@gmail.com",10.0);

        List<Student> s = new ArrayList<Student>();
        s.add(s1);
        s.add(s2);
        Collections.sort( s , new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // TODO Auto-generated method stub
                return o1.getName().compareTo(o2.getName());
            }
        });
        for( Student n:s){
            n.show();
        }
        Collections.sort( s , new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // TODO Auto-generated method stub
                return o1.getTbc() > o2.getTbc() ? 1 : -1;
            }
        });
        for( Student n:s){
            n.show();
        }


        List<Teacher> a = new ArrayList<>();
        a.add(t1);
        a.add(t2);
        Collections.sort( a , new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                // TODO Auto-generated method stub
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(Teacher b:a){
            b.print();
        }
        Collections.sort( a , new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                // TODO Auto-generated method stub
                return o1.getSalary() > o2.getSalary() ? 1 : -1;
            }
        });
        for(Teacher b:a){
            b.print();
        }
    }
}
