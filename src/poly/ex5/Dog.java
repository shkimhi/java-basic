package poly.ex5;

public class Dog implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("개소리");
    }

    @Override
    public void move() {
        System.out.println("이동");
    }
}
