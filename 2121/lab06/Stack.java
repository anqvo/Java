import java.util.ArrayList;

public class Stack<T> {
	
	private ArrayList<T> stack = new ArrayList<T>();
	private int top; // where should we add/remove
	
	public Stack() {
	
	}
	
	public void push(T item) {
		stack.add(top++, item); // add() is from ArrayList API
	}
	
	public T pop() {
		return stack.remove(--top); // remove() is from ArrayList API
	}
	
	public String toString() {
		String result = "";
		for(int i = 0; i < stack.size(); i++) { // ArrayList uses size()
			result = " " + this.stack.get(i); // get() is from ArrayList API
		}
		return result;
	}
}
