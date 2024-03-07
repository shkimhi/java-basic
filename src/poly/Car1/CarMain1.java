package poly.Car1;

public class CarMain1 {
    public static void main(String[] args) {

        Driver driver = new Driver();

        //k3 운전
        Car k3 = new K3();
        driver.setCar(k3);
        driver.drive();

        //model3 운전
        Car model3 = new Model3();
        driver.setCar(model3);
        driver.drive();

        Car newcar = new NewCar();
        driver.setCar(newcar);
        driver.drive();
    }
}
