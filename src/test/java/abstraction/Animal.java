package abstraction;

public abstract class Animal {
    int legs = 0;
    public abstract void makeSound();
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meowww...");
    }
}
