package ref;

public class NullMain {
    public static void main(String[] args) {
        Data data = null;
        System.out.println(data);
        Data data1 = new Data();
        System.out.println(data1);
        data1 = null;
        System.out.println(data1);
    }
}
