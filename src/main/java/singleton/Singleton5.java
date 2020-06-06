package singleton;

public class Singleton5 {



    private Singleton5(){

    }
    public static Singleton5 getInstance(){
        return SingletonInner.singleton;
    }
    static  class  SingletonInner{
        public static Singleton5 singleton = new Singleton5();
    }


}
