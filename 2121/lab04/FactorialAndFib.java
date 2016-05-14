import java.util.Scanner;

public class FactorialAndFib {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scan.nextInt();
		int answer = factorial(number);
		System.out.println("The answer is: " + answer + ".");
		System.out.print("Enter a number: ");
		number = scan.nextInt();
		answer = fib(number);
		System.out.println("The answer is: " + answer + ".");
	}
	
	public static int fib(int number) {
		int answer = 0;
		if(number == 0) {
			answer = 0;
		}
		else if(number == 1) {
			answer = 1;
		}
		else
			answer = fib(number - 1) + fib(number - 2);
		return answer;
	}
	
	/**
	___SUPPOSED TO PREVENT STACK OVERFLOW
	
	public static int otherFactorial(int number) {
		int answer = 0;
		if(number == 0) {
			answer = 1;
		}
		else
			answer = factorial_tail(number, 1);
		return answer;
	}
	
	public static int factorial_tail(int currentNumber, int sum) {
		int answer = 0;
		if(currentNumber == 1) {
			answer = 1;
		}
		else
			answer = factorial_tail(currentNumber - 1, sum * currentNumber);
		return answer;
	}
	
	**/
	
	public static int factorial(int number) {
		/**
		___ITERATIVELY
		 
		int answer = 0;
		for(int i = 0; i < number; i++) {
			answer = answer * number;
		}
		return answer;
		**/
		
		/**
		___RECURSIVELY
		**/
		int answer = 0;
		if(number == 0) {
			answer = 1;
		}
		else
			answer = number * factorial(number - 1);
		return answer;
	}
}
