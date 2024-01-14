import classes1.*;

public class Ex_05_Polymorphism {

    //the same entity (method or operator or object) can perform different operations in different scenarios.
    public static void main(String[] args) {

        Animal anm = new Animal();
        System.out.println(anm.Speak());

        Dog dog = new Dog();
        System.out.println(dog.Speak());

        Cat cat = new Cat();
        System.out.println(cat.Speak());

    }
}