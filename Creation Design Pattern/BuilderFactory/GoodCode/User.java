package BuilderFactory.GoodCode;

public class User {
    private String name;
    private String email;
    private String phone;
    private String address;
    private boolean isVerified;
    private boolean isAdmin;

    private User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.email = userBuilder.email;
        this.phone = userBuilder.phone;
        this.address = userBuilder.address;
        this.isVerified = userBuilder.isVerified;
        this.isAdmin = userBuilder.isAdmin;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", isVerified=" + isVerified +
                ", isAdmin=" + isAdmin +
                '}';
    }

    public static class UserBuilder {

        private String name;
        private String email;
        private String phone;
        private String address;
        private boolean isVerified;
        private boolean isAdmin;

        public UserBuilder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder verified(boolean isVerified) {
            this.isVerified = isVerified;
            return this;
        }

        public UserBuilder admin(boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
