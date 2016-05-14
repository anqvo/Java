import java.util.LinkedList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Iterator;

/**
 * ListIterator API contains methods:  hasNext(), next(), and remove().
 * Arrays API contains method: sort(integer).
 **/
 
public class LinkedListAndPQs {

	public static void main(String[] args) {
		Integer[] numbers = {7,2,5,9,4,10,21,31,6,19,2,32,21};
/**		
		LinkedList<Integer> data = new LinkedList<Integer>(Arrays.asList(numbers));
		ListIterator<Integer> iterator = data.listIterator();
		
		while(iterator.hasNext()) {
			int element = iterator.next();
			if(element % 2 == 0) { // if the element is even
				System.out.println("" + element + " is being removed.");
				iterator.remove();
			}
			else
				System.out.println(element);
		} // end while
**/		
		Arrays.sort(numbers);
		
		PriorityQueue queue = new PriorityQueue<Integer>(Arrays.asList(numbers));
		Iterator<Integer> iterate = queue.iterator();
		
		while(iterate.hasNext()) {
			int number = iterate.next();
			if(number % 2 == 0) {
				System.out.println("" + number + " is being removed.");
				iterate.remove();
			}
			else
				System.out.println(number);
		} // end while
		
	} // end main method
	
} // end LinkedListAndPQs class
