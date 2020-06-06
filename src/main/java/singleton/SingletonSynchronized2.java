package singleton;

import java.util.Objects;

public class SingletonSynchronized2 {

    private static SingletonSynchronized2 singleton = null;
    private static  Object obj = new Object();
    private SingletonSynchronized2(){

    }
    public static SingletonSynchronized2 getInstance(){
        if(singleton == null) {
            synchronized (obj) {
                if (Objects.isNull(singleton)) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    singleton = new SingletonSynchronized2();
                }
            }
        }
        return singleton;
    }

}
