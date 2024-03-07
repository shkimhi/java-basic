package poly.Car1;

public class CarMain1 {
    public static void main(String[] args) {

        Driver driver = new Driver();
        Car k3 = new K3();

        driver.setCar(k3);
        driver.drive();

        Car model3 = new Model3();

        driver.setCar(model3);
        driver.drive();
    }
}
