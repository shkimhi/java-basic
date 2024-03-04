package final1;

public class FinalRefMain {

    public static void main(String[] args) {
        final Data data = new Data(); // 참조형
        //data = new Data() // 참조값 변경 X

        //참조 대상의 값은 변경 가능.
        data.value =10;
        data.value =20;
    }
}
