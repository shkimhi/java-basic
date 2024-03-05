package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child(); //부모 타입은 자식 인스턴스 참조 가능
        // poly.childMethode(); // 호출 안됨 . 캐스팅 해야 호출 가능.

        //다운캐스팅 ( 부모타입 -> 자식 타입)
        Child child = (Child) poly;
        child.childMethod();

        //일시적 다운 캐스팅 - 해당 메서드를 호출하는 순간만 다운 캐스팅
        ((Child)poly).childMethod();

    }
}
