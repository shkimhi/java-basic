package poly.Car1;

public class K3 implements Car{
    @Override
    public void startEngine() {
        System.out.println("K3.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("K3.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K3.pressAccelerator");
    }
}
