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

        //Child child1 = new Parent(); // 자식은 부모를 담을 수 없음.
    }
}
