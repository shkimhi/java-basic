package poly.Car1;

public class Model3 implements Car{

    @Override
    public void startEngine() {
        System.out.println("Model3.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("Model3.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Model3.pressAccelerator");
    }
}
