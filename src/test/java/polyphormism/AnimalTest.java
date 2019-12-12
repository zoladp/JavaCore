package polyphormism;

public class AnimalTest {
    public static void main(String[] args) {
        Animal d1 = new Dog();
        d1.makeSound();

        Animal c1 = new Cat();
        c1.makeSound();
    }
}
