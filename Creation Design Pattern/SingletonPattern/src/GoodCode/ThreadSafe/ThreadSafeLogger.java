package SingletonPattern.src.GoodCode.ThreadSafe;

public class ThreadSafeLogger {
    
    private static ThreadSafeLogger logger;

    public static ThreadSafeLogger getInstance() {

        synchronized(ThreadSafeLogger.class) {
            if(logger == null) {
                logger = new ThreadSafeLogger();
            }

            return logger;
        }
    }

    public void log(String message) {
        System.out.println(message);
    }
}
