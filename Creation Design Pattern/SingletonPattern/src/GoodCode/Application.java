package SingletonPattern.src.GoodCode;

import SingletonPattern.src.GoodCode.ThreadSafe.ThreadSafeLogger;

public class Application {

    // Logger logger = Logger.getInstance();
    ThreadSafeLogger logger = ThreadSafeLogger.getInstance();
    public void run() {
        logger.log("Application is Started " + logger.toString());
    }
}
