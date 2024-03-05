package poly.basic;

//upcasting vs downcasting
public class CastingMain3 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child(); //부모 타입은 자식 인스턴스 참조 가능

        Child child = new Child();
        Parent parent = (Parent)child; // 업캐스팅은 생략 가능 ( 생략 권장 )
        Parent parent1 = child; // 업캐스팅 생략

        parent.prentMethod();
        parent1.prentMethod();

    }
}
