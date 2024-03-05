package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.prentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.childMethod();
        child.prentMethod();

        //부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child(); //부모 타입은 자식 인스턴스 참조 가능
        poly.prentMethod();
        // poly.childMethode(); // 호출 안됨 . 캐스팅 해야 호출 가능.

        //Child child1 = new Parent(); // 자식은 부모를 담을 수 없음.
        //자바에서 부모 타입은 자신은 물론이고, 자신을 기준으로 모든 자식 타입을 참조할 수 있다. >>> 다형적 참조
    }
}
