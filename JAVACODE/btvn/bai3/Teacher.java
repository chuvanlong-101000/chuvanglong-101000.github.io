import java.time.LocalDate;

public class Teacher extends Person {
    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    long salary;

    public void print() {
        super.show();
        System.out.println(" Lương :" + salary + "\n");
    }

    public Teacher( int id, String name ,LocalDate date ,String adress ,long phone , String email , long salary) {
        super(id, name, date, adress, phone, email);
        this.salary = salary;
    }
}
