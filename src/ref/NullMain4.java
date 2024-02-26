package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigData = new BigData();

        bigData.data = new Data();
        System.out.println(bigData.count);
        System.out.println(bigData.data);
        bigData.data.value = 300;

        System.out.println(bigData.data.value);
    }
}
