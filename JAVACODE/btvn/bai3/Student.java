import java.time.LocalDate;

public class Student extends Person {
    public double getTbc() {
        return tbc;
    }

    public void setTbc(double tbc) {
        this.tbc = tbc;
    }

    double tbc ;

    public void show() {
        super.show();
        System.out.println(" Điểm trung bình : " +tbc+ "\n");
    }

    public Student( int id, String name ,LocalDate date ,String adress ,long phone , String email , double tbc) {
        super(id, name, date, adress, phone, email);
        this.tbc = tbc;
    }
    
}
