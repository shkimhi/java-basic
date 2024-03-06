package poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        dog.sound();
        cat.sound();
        //caw.sound();
        sound(caw);
    }

    private static void sound(Caw caw){
        caw.sound();
    }
}
