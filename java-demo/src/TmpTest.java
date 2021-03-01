import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class TmpTest {
    public static void main(String[] args) {
        System.out.println(2 & 4);
        ThreadFactory factory = Executors.defaultThreadFactory();
        factory.newThread(
                TmpTest::run
        ).start();
    }

    private static void run() {
        System.out.println("lambda实现线程");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("lambda实现线程");
    }
}
