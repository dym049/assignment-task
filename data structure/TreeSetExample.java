import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        //  Create a TreeSet to store unique fruits
        Set<String> fruits = new TreeSet<>();
        
        //  Add elements to the TreeSet (duplicate elements will not be added)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Pineapple");
        fruits.add("Apple");  // Duplicate entry, will not be added
        
        //  Display the TreeSet (sorted order)
        System.out.println("Fruits TreeSet (sorted order, no duplicates): " + fruits);

        //  Check if an element exists in the TreeSet
        if (fruits.contains("Banana")) {
            System.out.println("The TreeSet contains Banana");
        } else {
            System.out.println("The TreeSet does not contain Banana");
        }

        // Remove an element from the TreeSet
        fruits.remove("Mango");
        System.out.println("Fruits TreeSet after removing Mango: " + fruits);
        
        //  Size of the TreeSet
        System.out.println("Size of the Fruits TreeSet: " + fruits.size());

        //  Iterate over the TreeSet using an Iterator
        System.out.println("Iterating over the TreeSet:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //  Clear all elements from the TreeSet
        fruits.clear();
        System.out.println("Fruits TreeSet after clearing all elements: " + fruits);
    }
}
