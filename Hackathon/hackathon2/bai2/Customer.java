import java.time.LocalDate;

public class Customer {
    public Customer(String id, String name, LocalDate dateOfBirth, String adresse, Gioitinh gioitinh, String phoneNumber,
            String email) {
        setId(id);
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gioitinh = gioitinh;
        this.adresse = adresse;
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = Validation.validateId(id);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Gioitinh getGioitinh() {
        return gioitinh;
    }
    public void setGioitinh(Gioitinh gioitinh) {
        this.gioitinh = gioitinh;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = Validation.validateMobile(phoneNumber);
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = Validation.validateEmail(email);
    }


    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", gioitinh=" +
         gioitinh + ", adresse=" + adresse + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
    }
    String id ;
    String name ;
    LocalDate dateOfBirth ;
    Gioitinh gioitinh ;
    String adresse ;
    String phoneNumber ;
    String email ;
}
