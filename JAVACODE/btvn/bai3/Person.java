import java.time.LocalDate;

public class Person {

    public void show() {
        System.out.println(" Date=" + date +"\n" + " Diachi=" + adress +"\n"+ " Email=" + email +"\n"+ " Id=" + id +"\n"+ " Sdt=" + phone
        +"\n"+ " Ten=" + name );
    }
    int id ;
    String name ;
    LocalDate date ;
    String adress ;
    long phone ;
    String email ;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
    public Person(int id, String name, LocalDate date, String adress, long phone, String email) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
    }
    
}