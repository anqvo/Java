/**

* An Vo

* CSCI 1583 (Fall 2014)

* Homework 6

* 24 October 2014

**/

import java.util.Scanner;

public class Homework6 {

	//Scanner is static so it may be used throughout class Homework6
	//The file also compiles when I state Scanner to be just "static Scanner scan = new Scanner(System.in);"
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n" + "Welcome to CCN, Calculating Complex Numbers.");
		executeInstructions();
	} //end method main
	
	//This method will execute instructions by calling methods printMenu and operateChoice methods
	public static void executeInstructions() {
		printMenu();
		operateChoice();
	} //end method executeInstructions
	
	//This method prints the menu to the user
	public static void printMenu() {
		System.out.println("Choose from the following menu to operate with two complex numbers:");
		System.out.println("1. Add" + "\n" + "2. Subtract" + "\n" + "3. Multiply" + "\n" + "4. Divide" + "\n" + "5. Quit");
		System.out.print("Enter your choice: ");
	} //end method printMenu
	
	//This method gets input from the user for a specified operation and each operation calls their specific method in class ComplexNumber to solve
	public static void operateChoice() {
		int choice = scan.nextInt();
		if(choice == 1) {
			System.out.println("\n" + "ADD");
			ComplexNumber firstComplex = getFirstComplex();
			ComplexNumber secondComplex = getSecondComplex();
		
			ComplexNumber sum = firstComplex.add(secondComplex);
			System.out.println("\n" + "The sum of the two complex numbers is: " + sum.toString() + "." + "\n");
			executeInstructions();
		}
		else if(choice == 2) {
			System.out.println("\n" + "SUBTRACT");
			ComplexNumber firstComplex = getFirstComplex();
			ComplexNumber secondComplex = getSecondComplex();
		
			ComplexNumber difference = firstComplex.subtract(secondComplex);
			System.out.println("\n" + "The difference of the two complex numbers is: " + difference.toString() + "." + "\n");
			executeInstructions();
		}
		else if(choice == 3) {
			System.out.println("\n" + "MULTIPLY");
			ComplexNumber firstComplex = getFirstComplex();
			ComplexNumber secondComplex = getSecondComplex();
		
			ComplexNumber product = firstComplex.multiply(secondComplex);
			System.out.println("\n" + "The product of the the two complex numbers is: " + product.toString() + "." + "\n");
			executeInstructions();
		}
		else if(choice == 4) {
			System.out.println("\n" + "DIVIDE");
			ComplexNumber firstComplex = getFirstComplex();
			ComplexNumber secondComplex = getSecondComplex();
		
			ComplexNumber quotient = firstComplex.divide(secondComplex);
			System.out.println("\n" + "The quotient of the two complex numbers is: " + quotient.toString() + "." + "\n");
			executeInstructions();
		}
		else if(choice > 5 || choice < 1) {
			System.out.print("\n" + "---INVALID CHOICE. TRY AGAIN: ");
			operateChoice();
		}
		else
			System.out.println("\n" + "Thank you. Goodbye.");
	} //end method operateChoice

	//Assuming the user knows that a complex number consists of a real number, a, plus a real number b multiplied by i: a+bi, where i is sqrt(-1)
	//This method will get input from the user two floats for the first complex number and return a ComplexNumber
	public static ComplexNumber getFirstComplex() {
		System.out.print("Enter the first part for the first complex number: ");
		float a = scan.nextFloat();
		System.out.print("Enter the second part for the first complex number: ");
		float b = scan.nextFloat();
		ComplexNumber firstComplex = new ComplexNumber(a, b);
		return firstComplex;
	} //end method getFirstComplex

	//Assuming the user knows that a complex number consists of a real number, a, plus a real number b multiplied by i: a+bi, where i is sqrt(-1)
	//This method will get input from the user two floats for the second complex number and return a ComplexNumber
	public static ComplexNumber getSecondComplex() {
		System.out.print("\n" + "Enter the first part for the second complex number: ");
		float c = scan.nextFloat();
		System.out.print("Enter the second part for the second complex number: ");
		float d = scan.nextFloat();
		ComplexNumber secondComplex = new ComplexNumber(c, d);
		return secondComplex;
	} //end method getSecondComplex
	
} //end class Homework6
