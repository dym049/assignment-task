class A {
    // Method with no parameters and void return type
    void display() {
        System.out.println("Display in A with no arguments");
    }

    // Method with one integer parameter
    void display(int x) {
        System.out.println("Display in A with an integer: " + x);
    }

    // Method with a String return type
    String displayString() {
        return "Display in A with a String return type";
    }
}

class B extends A {
    // Method Overriding: Same method signature as in A, but in B
    @Override
    public void display() {
        System.out.println("Display in B with no arguments");
    }

    // Method Overloading: Same method name, different parameter types
    public void display(int x) {
        System.out.println("Display in B with an integer: " + x);
    }

    // Method Overloading: Different parameter type (String) from A's display()
    public void display(String s) {
        System.out.println("Display in B with a string: " + s);
    }

    // Overriding a method with covariant return type (returning a String in B)
    @Override
    public String displayString() {
        return "Display in B with a String return type";
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of class B
        B b = new B();

        // Method calls for class B
        b.display();             // Calls overridden method in B
        b.display(10);           // Calls overloaded method in B with an int
        b.display("Hello");      // Calls overloaded method in B with a String
        System.out.println(b.displayString());  // Calls overridden method in B

        // Create an object of class A
        A a = new A();

        // Method calls for class A
        a.display();             // Calls method in A with no arguments
        a.display(100);          // Calls method in A with an int argument
        System.out.println(a.displayString());  // Calls method in A that returns a String
    }
}
