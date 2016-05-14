public class ComplexNumber {
	//The instance variables a and b representing
	//the real parts of the complex number
	private float a;
	private float b;

	//This is a constructor that accepts two floats as input arguments which represent the two parts to a complex number
	public ComplexNumber(float otherA, float otherB) {
		this.a = otherA;
		this.b = otherB;
	}
	
	//This method is called by a ComplexNumber from the add operation in the TUI and takes a ComplexNumber as its parameter and adds it to the ComplexNumber that called this method; also returns a ComplexNumber as the result
	public ComplexNumber add(ComplexNumber otherNumber) {
		ComplexNumber newComplex;
		float newA = a + otherNumber.getA();
		float newB = b + otherNumber.getB();
		newComplex = new ComplexNumber(newA, newB);
		return newComplex;
	}
	
	//This method is called by a ComplexNumber from the subtract operation in the TUI and takes a ComplexNumber as its parameter and subtracts it to the ComplexNumber that called this method; also returns a ComplexNumber as the result
	public ComplexNumber subtract(ComplexNumber otherNumber) {
		ComplexNumber newComplex;
		float newA = a - otherNumber.getA();
		float newB = b - otherNumber.getB();
		newComplex = new ComplexNumber(newA, newB);
		return newComplex;
	}
	
	//This method is called by a ComplexNumber from the multiply operation in the TUI and takes a ComplexNumber as its parameter and multiplies it to the ComplexNumber that called this method; also returns a ComplexNumber as the result
	public ComplexNumber multiply(ComplexNumber otherNumber) {
		ComplexNumber newComplex;
		float newA = a * otherNumber.getA();
		float newB = b * otherNumber.getB();
		float newC = newA - newB;
		
		float newD = b * otherNumber.getA();
		float newE = a * otherNumber.getB();
		float newF = newD + newE;
		newComplex = new ComplexNumber(newC, newF);
		return newComplex;
	}
	
	//This method is called by a ComplexNumber from the divide operation in the TUI and takes a ComplexNumber as its parameter and divides it by the ComplexNumber that called this method; also returns a ComplexNumber as the result
	public ComplexNumber divide(ComplexNumber otherNumber) {
		ComplexNumber newComplex;
		float newA = a * otherNumber.getA();
		float newB = b * otherNumber.getB();
		float newC = (newA + newB) / ((otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB() * otherNumber.getB()));
		
		float newD = b * otherNumber.getA();
		float newE = a * otherNumber.getB();
		float newF = (newD - newE) / ((otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB() * otherNumber.getB()));
		newComplex = new ComplexNumber(newC, newF);
		return newComplex;
	}
	
	//This method returns the float for newA from the parameter in the above operation methods
	public float getA() {
		return this.a;
	}
	
	//This method returns the float for newB from the parameter in the above operation methods
	public float getB() {
		return this.b;
	}
	
	//This method is called in each operation in class Homework6 and return the result of the specified operation in a string
	public String toString() {
		String result = a + " + " + b + "i";
		return result;
	}
}
