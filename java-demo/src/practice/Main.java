package practice;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

public class Main {
    private static Timer timer = new Timer();

    public static void main(String[] args) {
        /*CountDownLatch countDownLatch = new CountDownLatch(1);

        for(int i=0;i<5;i++){
            new Thread(()->{
                try {
                    countDownLatch.await();
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("准备开始");
        countDownLatch.countDown();*/

        timer.schedule(new Mytask(), new Date(),1000);
//        timer.scheduleAtFixedRate(new Mytask(),new Date(),1000);
    }

}

class Test implements Runnable{
    private static CountDownLatch countDownLatch;

    public Test(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
        countDownLatch.countDown();
    }
}


class Mytask extends TimerTask {
    @Override
    public void run()
    {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前时间：" + new Date());
    }
}

