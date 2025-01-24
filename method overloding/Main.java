class sum {
    // will cause a compiler error because it returns an int, but the parameter types are floating-point numbers (double and float).
    public int add(double i, float j) {
           return i + j;
   }
    public int add(short i, short j) {
       return i + j;
   }
   // This method conflicts because int can be promoted to double
   public float add(int i, double j) {  // Compiler error: overloaded method is ambiguous
    return (float) (i + j);
}

// This method conflicts because float can be promoted to double
public float add(float i, float j) {  // Compiler error: overloaded method is ambiguous
    return i + j;
}

   public float mul(float i, int j) {
       return i * j;
   }
}

public class Main {
  
    public static void main(String[] args) {
       sum s1 = new sum();
       System.out.println( s1.add(10, 10));            
       System.out.println( s1.add((short)50, (short)30));  
       System.out.println( s1.add(90, 3.5f));  
       System.out.println( s1.add(98.8, 3f));          
       System.out.println( s1.mul(10.5f, 95 ));         
   }
}