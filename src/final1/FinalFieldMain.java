package final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value); //10
        System.out.println(constructInit2.value); //20

        //final 필드초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        System.out.println(fieldInit1.value); // 10 무조건 데이터는 10이다. (데이터 중복 , 메모리 낭비)
        System.out.println(fieldInit2.value); // 10
        System.out.println(FieldInit.CONST_VALUE); // 상수 사용( 위에 문제 해결)

    }
}
