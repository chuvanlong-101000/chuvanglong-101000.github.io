package btvn.library;

public class Reader {

    

    @Override
    public String toString() {
        return "Reader [address =" + address + ", email =" + email + ", id Reader =" + id + ", mobile =" + mobile + ", name ="
                + name + "]";
    }

    private long id;
    private String name;
    private String email;
    private String mobile;
    private String address;

    public Reader(String name, String email, String mobile, String address) {
        id = IdGenerator.getNewIDReader();
        setName(name);
        setEmail(email);
        setMobile(mobile);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
