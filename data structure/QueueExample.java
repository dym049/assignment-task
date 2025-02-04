import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        
        // Adding elements to the queue
        queue.add("John");
        queue.add("Jane");
        queue.add("Jack");
        
        // Display and process elements
        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }
    }
}

