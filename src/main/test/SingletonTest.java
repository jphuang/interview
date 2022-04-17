
import org.junit.Test;

import org.springframework.util.StopWatch;
import singleton.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.MAX_PRIORITY;

public class SingletonTest {
    int threadNum = 4;
    int clientNum = 5;
    ExecutorService exec = Executors.newFixedThreadPool(threadNum);

    @Test
    public void testSingle(){
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        assert  instance == instance1;
    }

    @Test
    public void testThreadPool(){
        StopWatch stopWatch = new StopWatch("testThreadPool");
        stopWatch.start();
        for (int i = 0; i < clientNum; i++) {
            Runnable run = new Runnable() {
                public void run() {
                    Singleton instance = Singleton.getInstance();
                    System.out.println(instance);
                }
            };
            exec.execute(run);
        }
        exec.shutdown();
        try {
            exec.awaitTermination(MAX_PRIORITY, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

    @Test
    public void testSingletonSynchronized(){
        StopWatch stopWatch = new StopWatch("testSingletonSynchronized");
        stopWatch.start();
        for (int i = 0; i < clientNum; i++) {
            Runnable run = new Runnable() {
                public void run() {
                    SingletonSynchronized instance = SingletonSynchronized.getInstance();
                    System.out.println(instance);
                }
            };
            exec.execute(run);
        }
        exec.shutdown();
        try {
            exec.awaitTermination(MAX_PRIORITY, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }
    @Test
    public void testSingletonSynchronized2(){
        StopWatch stopWatch = new StopWatch("SingletonSynchronized2");
        stopWatch.start();
        for (int i = 0; i < clientNum; i++) {
            Runnable run = new Runnable() {
                public void run() {
                    SingletonSynchronized2 instance = SingletonSynchronized2.getInstance();
                    System.out.println(instance);
                }
            };
            exec.execute(run);
        }
        exec.shutdown();
        try {
            exec.awaitTermination(MAX_PRIORITY, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

    @Test
    public void testSingleton4(){
        StopWatch stopWatch = new StopWatch("testSingleton4");
        stopWatch.start();
        for (int i = 0; i < clientNum; i++) {
            Runnable run = new Runnable() {
                public void run() {
                    Singleton4 instance = Singleton4.getInstance();
                    System.out.println(instance);
                }
            };
            exec.execute(run);
        }
        exec.shutdown();
        try {
            exec.awaitTermination(MAX_PRIORITY, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

    @Test
    public void testSingleton5(){
        StopWatch stopWatch = new StopWatch("testSingleton5");
        stopWatch.start();
        for (int i = 0; i < clientNum; i++) {
            Runnable run = new Runnable() {
                public void run() {
                    Singleton5 instance = Singleton5.getInstance();
                    System.out.println(instance);
                }
            };
            exec.execute(run);
        }
        exec.shutdown();
        try {
            exec.awaitTermination(MAX_PRIORITY, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }
}
