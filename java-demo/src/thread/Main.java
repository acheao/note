package thread;

import edu.princeton.cs.algs4.StdOut;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main {
    public static void main(String[] args) {
        /*ThreadFactory factory = Executors.defaultThreadFactory();
        factory.newThread(new Printer("Notice!")).start();
        for(int i = 0; i<1000; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Good!");

        }*/

        /*BoundedResource resource = new BoundedResource(3);
        for(int i = 0; i<10; i++){
            new UserThread(resource).start();
        }*/

        System.out.println("Testing EaterThread, hit CTRL+C to exit.");
        Tool spoon = new Tool("Spoon");
        Tool fork = new Tool("Fork");
        new EaterThread("Alice",fork,spoon).start();
        new EaterThread("Bobby",fork,spoon).start();
//        死锁
//        new EaterThread("Alice",spoon,fork).start();
//        new EaterThread("Bobby",fork,spoon).start();

    }
}
