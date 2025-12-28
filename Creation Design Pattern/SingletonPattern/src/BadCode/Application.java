package SingletonPattern.src.BadCode;

public class Application {
    
    Logger logger = new Logger();
    public void run() {
        logger.log("Application is Started" + logger.toString());
    }
}
