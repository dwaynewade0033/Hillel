package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Generator {
    int count = 0;
    Lock lock = new ReentrantLock();

    public void increment() {
        System.out.println(Thread.currentThread().getId() + " call increment");
        lock.lock();
        count = count + 1;
        lock.unlock();
        System.out.println("finished = " + Thread.currentThread().getId() + " call increment");
    }

    public int getCount() {
        return count;
    }


    public static void main(String[] args) throws InterruptedException {
        Generator g = new Generator();
        int iteration = 0;

        while (true) {
            SimpleIncrementor t1 = new SimpleIncrementor(g);
            SimpleIncrementor t2 = new SimpleIncrementor(g);
            SimpleIncrementor t3 = new SimpleIncrementor(g);
            SimpleIncrementor t4 = new SimpleIncrementor(g);
            SimpleIncrementor t5 = new SimpleIncrementor(g);
            SimpleIncrementor t6 = new SimpleIncrementor(g);


            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            t6.start();
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            iteration++;

            if (g.getCount() != 5) {
                System.out.println("ERROR " + iteration);
                break;
            } else {
                g.count = 0;
            }

        }
        System.out.println(g.count);
    }

}
