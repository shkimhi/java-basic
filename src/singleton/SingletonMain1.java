package singleton;

public class SingletonMain1 {

    public static void main(String[] args) {
        /*Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);

        System.out.println(instance1 == instance2);
        System.out.println(instance1 == instance3);*/

        Thread thread1 = new Thread(() -> {
            Singleton1 singleton = Singleton1.getInstance();
            System.out.println(singleton);
            System.out.println(singleton.getCount());
        });

        Thread thread2 = new Thread(() -> {
            Singleton1 singleton = Singleton1.getInstance();
            System.out.println(singleton);
            System.out.println(singleton.getCount());
        });

        Thread thread3 = new Thread(() -> {
            Singleton1 singleton = Singleton1.getInstance();
            System.out.println(singleton);
            System.out.println(singleton.getCount());
        });

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
