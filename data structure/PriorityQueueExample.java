import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        
        // Creating a PriorityQueue of integers (natural ordering: smallest first)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // Adding elements to the PriorityQueue
        pq.add(50);
        pq.add(10);
        pq.add(30);
        pq.add(40);
        pq.add(20);

        // Displaying the elements of the PriorityQueue
        System.out.println("PriorityQueue elements (natural ordering):");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }
}
