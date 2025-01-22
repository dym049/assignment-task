
abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

interface Walkable {
    void walk();
}

public class test extends Animal implements Walkable {

    static {
        System.out.println("Static block executed!");
    }

    public test() {
        System.out.println("Constructor of Test class invoked!");
    }

    void sound() {
        System.out.println("The animal makes a sound.");
    }

    public void walk() {
        System.out.println("The animal is walking.");
    }

    public static void main(String[] args) {

        test testAnimal = new test();

        testAnimal.sound();
        testAnimal.sleep();
        testAnimal.walk();
    }
}
