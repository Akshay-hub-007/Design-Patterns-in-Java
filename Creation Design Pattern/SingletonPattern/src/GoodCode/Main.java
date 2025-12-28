package SingletonPattern.src.GoodCode;

public class Main {
    
    public static void main(String[] args) {
        Application application = new Application();
        application.run();

        UserService userService = new UserService();
        userService.run();
    }
}
