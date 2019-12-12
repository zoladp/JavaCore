package polyphormism;

public class Animal {
    public void makeSound() {
        System.out.println("Grr...");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof");
        System.out.println("");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}
