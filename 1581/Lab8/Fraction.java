public class Fraction {
	private int numerator;		//instance variable
	private int denominator;	//instance variable

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return this.numerator;
	}

	public int getDenominator() {
		return this.denominator;
	}

	public Fraction addFraction(Fraction otherFraction) {
		int commonDom = getCommonDenominator(this, otherFraction);
		int denominator = commonDom;
		int numerator = this.numerator*otherFraction.getDenominator() + this.denominator*otherFraction.getNumerator();
		Fraction sum = new Fraction(numerator, denominator);
		return sum;
	}

	public Fraction subtractFraction(Fraction otherFraction) {
		int commonDom = getCommonDenominator(this, otherFraction);
		int denominator = commonDom;
		int numerator = this.numerator*otherFraction.getDenominator() - this.denominator*otherFraction.getNumerator();
		Fraction difference = new Fraction(numerator, denominator);
		return difference;
	}

	public Fraction multiplyFraction(Fraction otherFraction) {
		int denominator = this.denominator * otherFraction.getDenominator();
		int numerator = this.numerator * otherFraction.getNumerator();
		Fraction product = new Fraction(numerator, denominator);
		return product;
	}

	public Fraction divideFraction(Fraction otherFraction) throws IllegalArgumentException{
		if(otherFraction.getNumerator() == 0 || otherFraction.getDenominator() == 0) {
			throw new IllegalArgumentException("Cannot divide by zero, you numpty.");
		}
		int denominator = this. denominator * otherFraction.getNumerator();
		int numerator = this.numerator * otherFraction.getDenominator();
		Fraction quotient = new Fraction(numerator, denominator);
		return quotient;
	}

	public String toString() {
		String representation = this.getNumerator() + "/" + this.getDenominator();
		return representation;
	}

	public int getCommonDenominator(Fraction fraction1, Fraction fraction2) {
		int commonDom = fraction1.getDenominator() * fraction2.getDenominator();
		return commonDom;
	}

}
