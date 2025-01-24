
class Calculator {
   
    public int add(int i, int j) {
        return i + j;
    }
}
class AdvancedCalculator extends Calculator {
    // Correct method overriding
    @Override
    public int add(int i, int j) {
        System.out.println("Adding two inteager in AdvancedCalculator");
        return i + j;
    }
    // Incorrect method overriding (this will cause a compiler error)
    @Override
    public double add(int i, int j) { // Incorrect: changed return type to double
        System.out.println("Adding two integers with a different return type in AdvancedCalculator");
        return i + j;
    }

    public float add(float i, float j) {
        System.out.println("Adding two floats in AdvancedCalculator");
        return i + j;
    }
    public float add(int i, float j) {
        System.out.println("Adding an integer and a float in AdvancedCalculator");
        return i + j;
    }
    public float add(float i, int j) {
        System.out.println("Adding a float and an integer in AdvancedCalculator");
        return i + j;
    }
public float mul(float i, int j) {
        System.out.println("multiplication a float and an integer in AdvancedCalculator");
        return i * j;
    }

}

public class Main {
    public static void main(String[] args) {
        
        Calculator basicCalc = new Calculator();
        AdvancedCalculator advancedCalc = new AdvancedCalculator();
        System.out.println( basicCalc.add(100, 95)); 
        System.out.println( advancedCalc.add(85, 3));       
        System.out.println(advancedCalc.add(10.5f, 1.3f)); 
        System.out.println(advancedCalc.add(95, 10.5f));  
        System.out.println( advancedCalc.mul(98.5f, 90));  
}
}