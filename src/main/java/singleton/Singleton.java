package singleton;

import java.util.Objects;

public class Singleton {

    private static  Singleton singleton = null;

    private Singleton(){

    }
    public static Singleton getInstance(){
        if(Objects.isNull(singleton)){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singleton = new Singleton();
        }
        return singleton;
    }

}
