import edu.princeton.cs.algs4.StdOut;

import java.util.Random;
import java.util.concurrent.ThreadPoolExecutor;

public class RandomEnum {

    private static Random rand = new Random();


    public static void main(String[] args) {
        System.out.println(random(Reward.class));
//        System.out.println(random(Todo.class));
    }

    public static <T> T random(T[] values){
        return values[rand.nextInt(values.length)];
    }

    public static <T extends Enum<T>> T random(Class<T> en) {
        return random(en.getEnumConstants());
    }

}
