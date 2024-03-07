package singleton;

public class SingletonMain {

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
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
            System.out.println(singleton.getCnt());
        });

        Thread thread2 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
            System.out.println(singleton.getCnt());
        });

        Thread thread3 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
            System.out.println(singleton.getCnt());
        });

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
