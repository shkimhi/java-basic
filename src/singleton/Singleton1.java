package singleton;

public class Singleton1 {
    private volatile int count = -1;
    private Singleton1(){
        count = 0;
    }
    public static Singleton1 getInstance(){
        return SingletonHelper.INSTANCE;
    }
    public int getCount(){
        return count;
    }


    private static class SingletonHelper{
        private static final Singleton1 INSTANCE  = new Singleton1();
    }


}
