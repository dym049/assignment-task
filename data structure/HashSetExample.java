import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        //  Create a HashSet to store unique fruits
        Set<String> names = new HashSet<>();
        
        //  Add elements to the HashSet (duplicate elements will not be added)
        names.add("dhruvi");
        names.add("dhruvi1");
        names.add("dharti");
        names.add("dhara");  // Duplicate entry, will not be added
        
        //  Display the HashSet (order is not guaranteed)
        System.out.println("names Set (no duplicates): " + names);

        //  Check if an element exists in the HashSet
        if (names.contains("dhruvi1")) {
            System.out.println("The set contains dhruvi1");
        } else {
            System.out.println("The set does not contain dhruvi1");
        }

        //  Remove an element from the HashSet
        names.remove("dharti");
        System.out.println("names Set after removing dharti: " + names);
        
        //  Size of the HashSet
        System.out.println("Size of the names Set: " + names.size());

        //  Iterate over the HashSet using an Iterator
        System.out.println("Iterating over the set:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //  Clear all elements from the HashSet
        names.clear();
        System.out.println("names Set after clearing all elements: " + names);
    }
}
