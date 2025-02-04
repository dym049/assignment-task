import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        List<String> list = new ArrayList<>();

        // Add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Access an element at a specific index
        System.out.println("Element at index 1: " + list.get(1));  // Output: Banana

        // Remove an element by index
        list.remove(0);  // Removes "Apple"

        // Remove an element by object
        list.remove("Orange");  // Removes "Orange"

        // Check the size of the list
        System.out.println("Size of the list: " + list.size());  // Output: 1

        // Modify an element
        list.set(0, "Grapes");

        // Print all elements in the list
        System.out.println("Updated List:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Check if a specific element is in the list
        System.out.println("Contains 'Banana': " + list.contains("Banana"));  // Output: false

        // Clear the list
        list.clear();
        System.out.println("List after clear: " + list);  // Output: []
    }
}
