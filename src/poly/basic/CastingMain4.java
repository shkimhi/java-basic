package poly.basic;
//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;

        child1.childMethod(); //문제 없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // 런타임 오류 왜? -> 실제 Child 인스턴스가 메모리 상에 생성되지 않았기 때문.
        child2.childMethod(); //실행 불가

        //업캐스팅이 안전하고 다운캐스팅이 위험한 이유 ?
        //업캐스팅의 경우 자식 인스턴스 생성 시 메모리에 부모 인스턴스까지 다 생성되기 때문에 문제되지 않음.
        //하지만 다운캐스팅의 경우 자식 인스턴스가 생성이 되지 않기 때문에 ClassChasException 발생.
    }
}
