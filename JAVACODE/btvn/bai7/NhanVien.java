public class NhanVien {
    public NhanVien(long id, String name, long tuoi, int phoneNumber, String email, long salary) {
        this.id = id;
        this.name = name;
        this.tuoi = tuoi;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getTuoi() {
        return tuoi;
    }
    public void setTuoi(long tuoi) {
        this.tuoi = tuoi;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "NhanVien [ id=" + id + ", name=" + name + ", tuoi=" + tuoi + ", phoneNumber=" + phoneNumber + 
        ", email=" + email + ", salary=" + salary + "]";
    }
    long id ;
    String name ;
    long tuoi ;
    int phoneNumber ;
    String email ;
    long salary ;
}
