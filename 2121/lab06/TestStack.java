public class TestStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		Integer one = stack.pop();
		Integer two = stack.pop();
		Integer three = stack.pop();
		System.out.println("Popped " + one);
		System.out.println("Popped " + two);
		System.out.println("Popped " + three);
	}
}
