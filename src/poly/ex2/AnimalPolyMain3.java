package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        Animal[] arr = {new Dog(), new Cat(), new Caw()};
        for (Animal animal : arr) {
            extracted(animal);
        }
    }

    private static void extracted(Animal animal) {
        animal.sound();
    }

}
