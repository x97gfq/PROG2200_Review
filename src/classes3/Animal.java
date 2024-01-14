package classes3;
//ref: https://www.w3schools.com/java/java_abstract.asp

abstract class Animal {

    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}