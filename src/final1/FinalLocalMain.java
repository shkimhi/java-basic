package final1;

public class FinalLocalMain {

    public static void main(String[] args) {

        final int data1;
        data1 = 10; // 최초 1회 할당 가능
        //data1 = 20; // 컴파일 에러

        final int data2 = 10; //선언 시 초기화
        //data2 = 20; // 컴파일 에러

    }
    static void method(final int parameter){
        //parameter = 10;// 컴파일 에러

    }
}
