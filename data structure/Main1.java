// Java Program for treemap with the SortedMap Constructor
import java.util.*;

// Main class
public class Main1{
	// Main driver method
	public static void main(String[] args)
	{
	    // Creating a SortedMap {key: Integer, value: String}
	    SortedMap<Integer, String> smap = new TreeMap<>();

		// Storing key-value pairs by using put() method
		smap.put(1 ,"Alex");
		smap.put(5 ,"Marsh");
		smap.put(3 ,"John");
		smap.put(4 ,"Chris");
		smap.put(2, "Tim");
		
		// Printing the entries before id-3 in ascending order (id-3 will be excluded)
		System.out.println("headMap: " + smap.headMap(3));
		
		// Printing the entries from id-3 till the end in ascending order
		System.out.println("tailMap: " + smap.tailMap(3));
		
		// Printing the entries from id-2 to id-5 in ascending order (id-5 will be excluded)
		System.out.println("subMap: " + smap.subMap(2, 5));

		// Printing the elements of TreeMap
		System.out.println("Employees: " + smap);
	}
}
