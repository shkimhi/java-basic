package extends1.overriding;

public class ElectricCar extends Car {

    @Override //없어도 무방하지만 오버라이드가 정확히 되지 않으면 컴파일 에러를 내줌. ( 혹시라도 모를 실수 예방)
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다");
    }

    public void charge(){
        System.out.println("충전");
    }
}
