import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample{
    public static void main(String[] args) {
        // Creating a LinkedHashMap with insertion order
        Map<Integer, String> map = new LinkedHashMap<>();

        // Adding key-value pairs to the map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        // Displaying the LinkedHashMap (insertion order preserved)
        System.out.println("LinkedHashMap (Insertion Order): " + map);

        // Accessing an element
        System.out.println("Value for key 2: " + map.get(2)); // Output: Banana

        // Adding another element
        map.put(5, "Elderberry");

        // Displaying the map after adding a new element
        System.out.println("LinkedHashMap after adding new element: " + map);

        // Removing an element
        map.remove(3); // Removes the entry for key 3

        // Displaying the map after removal
        System.out.println("LinkedHashMap after removal of key 3: " + map);
    }
}

