package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Animal[] arr = {dog,cat,caw};
        for (Animal animal : arr) {
            animal.sound();
        }
    }

}
