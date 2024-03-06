package poly.ex4;

public abstract class AbstractAnimal {

    // 추상 메서드가 하나라도 있는 클래스는 추상클래스로 선언 해야함.
    // 이 클래스를 상속받는 클래스는 무조건 sound()를 재정의 해야함.
    public abstract void sound();

    public abstract void move();
}
