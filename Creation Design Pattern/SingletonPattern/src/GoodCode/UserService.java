package SingletonPattern.src.GoodCode;

import SingletonPattern.src.GoodCode.ThreadSafe.ThreadSafeLogger;

public class UserService {

    // Logger logger = Logger.getInstance();
        ThreadSafeLogger logger = ThreadSafeLogger.getInstance();

    public void run() {
        logger.log("UserService Started " + logger.toString());
    }

}
