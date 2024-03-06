package poly.ex5;

public class InterfaceMain {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Caw caw = new Caw();
        Dog dog = new Dog();
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(dog);

    }

    private static void soundAnimal(InterfaceAnimal animal){
        animal.sound();
    }
}
