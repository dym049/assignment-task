import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        
        // Print the ArrayList
        System.out.println("ArrayList: " + numbers);
        
        // Access an element using index
        System.out.println("Element at index 2: " + numbers.get(2));  // Output: 30
        
        // Modify an element at a specific index
        numbers.set(1, 25);  // Changing element at index 1 (20 to 25)
        System.out.println("Modified ArrayList: " + numbers);
        
        // Remove an element at a specific index
        numbers.remove(3);  // Removes the element at index 3 (40)
        System.out.println("After removing element at index 3: " + numbers);
        
        // Check the size of the ArrayList
        System.out.println("Size of ArrayList: " + numbers.size());
        
        // Check if the ArrayList contains a specific value
        boolean containsValue = numbers.contains(25);  // Checking if 25 is in the list
        System.out.println("ArrayList contains 25: " + containsValue);
        
        // Clear all elements from the ArrayList
        numbers.clear();
        System.out.println("ArrayList after clearing: " + numbers);
    }
}

