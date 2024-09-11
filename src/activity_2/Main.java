package activity_2;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        dog.makeSound();
        ((Mammal) dog).move();

        cat.makeSound();
        ((Mammal) cat).move();
    }
}
