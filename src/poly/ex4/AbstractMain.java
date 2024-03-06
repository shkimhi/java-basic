package poly.ex4;

public class AbstractMain {

    public static void main(String[] args) {
        //추상 클래스 생성 불가
        //AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);

    }

    private static void soundAnimal(AbstractAnimal animal){
        animal.sound();
    }
    private static void moveAnimal(AbstractAnimal animal){
        animal.move();
    }
}
