
//Danh sách khách hàng
public class Customer implements Entity {
    

    @Override
    public String toString() {
        return "Customer [address=" + address + ", customerName=" + customerName + ", email=" + email + ", id=" + id
                + ", mobile=" + mobile + "]";
    }

    private Long id ;
    private String customerName ;
    private String email;
    private String mobile;
    private String address;

    
    
    

    public Customer( String customerName, String email, String mobile, String string) {
        id = IdGenerator.getNewID();
        setCustomerName(customerName);
        setEmail(email);
        setMobile(mobile);
        setAddress(address);
    }
    
    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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
