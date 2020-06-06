package singleton;

import java.util.Objects;

public class Singleton4 {

    private static Singleton4 singleton = new Singleton4();

    private Singleton4(){

    }
    public static Singleton4 getInstance(){
        return singleton;
    }

}
