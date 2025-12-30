package BuilderFactory.BadCode;

public class User {

    private String name;
    private String email;
    private String phone;
    private String address;
    private boolean isVerified;
    private boolean isAdmin;

    // Constructor 1
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Constructor 2
    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Constructor 3
    public User(String name, String email, String phone, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    // Constructor 4
    public User(String name, String email, String phone,
                String address, boolean isVerified) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.isVerified = isVerified;
    }

    // Constructor 5 😵
    public User(String name, String email, String phone,
                String address, boolean isVerified, boolean isAdmin) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.isVerified = isVerified;
        this.isAdmin = isAdmin;
    }

    // Getters & Setters

    public User() {
        
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

    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isVerified() {
        return isVerified;
    }
    
    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
    
    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
