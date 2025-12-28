package SingletonPattern.src.BadCode;

public class UserService {

    Logger logger = new Logger();

    public void run() {
        logger.log("UserService Started" + logger.toString());
    }

}
