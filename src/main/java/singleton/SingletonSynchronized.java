package singleton;

import java.util.Objects;

public class SingletonSynchronized {

    private static SingletonSynchronized singleton = null;
    private static  Object obj = new Object();
    private SingletonSynchronized(){

    }
    public static SingletonSynchronized getInstance(){
        synchronized (obj) {
            if (Objects.isNull(singleton)) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                singleton = new SingletonSynchronized();
            }
        }
        return singleton;
    }

}
