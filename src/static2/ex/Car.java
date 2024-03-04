package static2.ex;

public class Car {

    private String car;
    private static int carCnt;

    public Car(String car) {
        System.out.println("차량 구입, 이름 : "+ car);
        this.car = car;
        carCnt++;
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수 : "+ carCnt);
    }




}
