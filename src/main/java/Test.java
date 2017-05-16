import org.apache.log4j.Logger;

/**
 * Created by boxiaotong on 2017/4/17.
 */
public class Test {
    private static Logger logger = Logger.getLogger(Test.class);

    /**
     * @param args
     */
    public static void main(String[] args) {

        logger.debug("This is debug message.");
        logger.info("This is info message.");
        logger.error("This is error message.");
    }
}
