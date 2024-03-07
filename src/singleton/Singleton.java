package singleton;


public class Singleton {
    private int cnt = -1;
    private Singleton(){
        cnt = 0;
    }
    private static Singleton singletonObject;

    public static synchronized Singleton getInstance(){
        if(singletonObject == null){
            singletonObject = new Singleton();
        }
        return singletonObject;
    }
    public int getCnt(){
        return cnt;
    }


}
/*
    private static class SingletonHolder {
        private static final Singleton SINGLETON_OBJECT = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.SINGLETON_OBJECT;
    }
*/
/*
    private static Singleton singletonObject;

    public static synchronized Singleton getInstance(){
        if(singletonObject == null){
            singletonObject = new Singleton();
        }
        return singletonObject;
    }
*/
