import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.concurrent.LinkedBlockingQueue;
public class RandomTest {

    private static Logger logger = LogManager.getLogger(RandomTest.class.getName());


    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<String> test = new LinkedBlockingQueue<String>();
        test.put("test");
        for(String iter:test){
            iter = "dsfasdf";
        }
        System.out.println("test");
    }
}
