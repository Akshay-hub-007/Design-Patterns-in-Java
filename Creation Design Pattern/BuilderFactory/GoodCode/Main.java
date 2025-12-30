package BuilderFactory.GoodCode;

import BuilderFactory.GoodCode.User.UserBuilder;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Aksha", "aksha@email.com")
                .phone("9876543210")
                .address("Bangalore")
                .verified(true)
                .build();

        System.out.println(user);
    }
}
