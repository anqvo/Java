/**
* An Vo
* CSCI 1583-002
* Homework7
* 20 November 2014
* C. Summa
**/

/**
* This is a TUI to test and ensure that interface Collection, abstract
* class AbstractCollection, class Stack, and class Queue are
* working properly.
**/
public class Homework7 {
	public static void main(String[] args) {
		Stack stack = new Stack(); // building a new reference object Stack
		Queue queue = new Queue(); // building a new reference object Queue
		
		/**
		* This is declaring String variables to test Stack and Queue classes;
		* declaring enough to expand the Stack and Queue dynamically.
		**/
		String one = "one";	// one through four to make the stack full
		String two = "two";
		String three = "three";
		String four = "four";
 
		String five = "five";	// five through eight to ensure that the stack will expanded
		String six = "six";
		String seven = "seven";
		String eight = "eight";
		
		String nine = "nine";	// a ninth value to ensure that the stack will expand again

		/**
		* This is individually printing out each push, peek, and size of the stack.
		**/
		System.out.println("_____STACK_____"); // to easily notice where stack begins
		System.out.println("The stack is empty: " + stack.isEmpty()); // checking if the stack is empty (true)
		stack.push(one);
		System.out.println("Peek stack: " + stack.peek() + " | " + "Size: " + stack.size());
		stack.push(two);
		System.out.println("Peek stack: " + stack.peek() + " | " + "Size: " + stack.size());
		stack.push(three);
		System.out.println("Peek stack: " + stack.peek() + " | " + "Size: " + stack.size());
		stack.push(four);
		System.out.println("Peek stack: " + stack.peek() + " | " + "Size: " + stack.size());
		
		System.out.println("The stack has expanded."); // changing the output to easier view where the stack expanded
		stack.push(five); // the stack will expand here
		System.out.println("Peek: " + stack.peek() + " | " + "Size: " + stack.size());
		stack.push(six);
		System.out.println("Peek: " + stack.peek() + " | " + "Size: " + stack.size());
		stack.push(seven);
		System.out.println("Peek: " + stack.peek() + " | " + "Size: " + stack.size());
		stack.push(eight);
		System.out.println("Peek: " + stack.peek() + " | " + "Size: " + stack.size());
		
		System.out.println("The stack has expanded again."); // changing output to easier view where the stack expanded again
		stack.push(nine); // the stack will expand a second time here
		System.out.println("Peeking: " + stack.peek() + " | " + "Size: " + stack.size());
		System.out.println("The stack is empty: " + stack.isEmpty() + "\n"); // checking if the stack is empty (false)
		
		for(int i = 0; i < stack.getStringArray().length; i++) {
			System.out.println(stack.getStringArray()[i]);	// printing out the entire stack
		}
		
		System.out.println(); //separating pushing from popping
		
		/**
		* This is looping through and printing out each pop, peek, and size of the stack.
		**/
		for(int i = 0; i < stack.getStringArray().length; i++) {
			System.out.println("Popped: " + stack.pop() + " | " + "Peek: " + stack.peek() + " | " + "Size: " + stack.size());
		}
		System.out.println("The stack is empty: " + stack.isEmpty());	// checking if the stack is empty
																									// after all Strings have been popped
		
		System.out.println(); // printing blank spaces 
		System.out.println(); // to separate Stack from Queue
		System.out.println();
		
		/**
		* This is individually printing out each add, remove, and size of the queue.
		**/
		System.out.println("_____QUEUE_____"); // to easily notice where queue begins
		System.out.println("The queue is empty: " + queue.isEmpty()); // checking if the queue is empty (true)
		queue.add(one);
		System.out.println("Peek queue: " + queue.peek() + " | " + "Size: " + queue.size());
		queue.add(two);
		System.out.println("Peek queue: " + queue.peek() + " | " + "Size: " + queue.size());
		queue.add(three);
		System.out.println("Peek queue: " + queue.peek() + " | " + "Size: " + queue.size());
		queue.add(four);
		System.out.println("Peek queue: " + queue.peek() + " | " + "Size: " + queue.size());
		
		System.out.println("The queue has expanded."); // changing output to easier view where the queue expanded
		queue.add(five);
		System.out.println("Peek: " + queue.peek() + " | " + "Size: " + queue.size());
		queue.add(six);
		System.out.println("Peek: " + queue.peek() + " | " + "Size: " + queue.size());
		queue.add(seven);
		System.out.println("Peek: " + queue.peek() + " | " + "Size: " + queue.size());
		queue.add(eight);
		System.out.println("Peek: " + queue.peek() + " | " + "Size: " + queue.size());
		
		System.out.println("The queue has expanded again."); // changing output to easier view where the queue expanded again
		queue.add(nine);
		System.out.println("Peeking: " + queue.peek() + " | " + "Size: " + queue.size());
		System.out.println("The queue is empty: " + queue.isEmpty() + "\n"); // checking if the queue is empty (false)
		
		for(int i = 0; i < queue.getStringArray().length; i++) {
			System.out.println(queue.getStringArray()[i]);	// printing out the entire queue
		}
		
		System.out.println(); // separating adding from removing
		
		/**
		* This is looping through and printing out each remove, peek, and size of the queue.
		**/
		for(int i = 0; i < queue.getStringArray().length; i++) {
			System.out.println("Removed: " + queue.remove() + " | " + "Peek: " + queue.peek() + " | " + "Size: " + queue.size());
		}
		System.out.println("The queue is empty: " + queue.isEmpty());	// checking if the queue is empty
																							// after all Strings have been removed
	} // end method main
} // end class Homework7
