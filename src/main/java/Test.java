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
        System.out.println("This is println message.");
        try {
            logger.debug("main");
            int i = 1 / 0;
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
    }
}
