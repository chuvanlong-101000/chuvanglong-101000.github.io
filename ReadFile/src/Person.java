package ReadFile.src;

public class Person {
    @Override
    public String toString() {
        return "Person [country=" + country + ", dateOfBirth=" + dateOfBirth + ", firstName=" + firstName + ", gender="
                + gender + ", id=" + id + ", lastName=" + lastName + "]";
    }
    Long id ;
    String firstName ;
    String lastName ;
    String gender ;
    String dateOfBirth ;
    String country ;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    
    public Person(Long id, String firstName, String lastName, String gender, String dateOfBirth, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
    }
    
}
