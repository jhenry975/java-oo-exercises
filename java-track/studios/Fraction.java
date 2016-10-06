/*A fraction has a numerator and denominator. A fraction should be able to add itself
 *  to another fraction, returning a new fraction that represents the sum. A fraction 
 *  should be able to multiply itself by another fraction, returning a new fraction as
 *   the product. A fraction should be able to take the reciprocal of itself, returning
 *    that value as a new fraction. A fraction should be able to simplify itself,
 *     returning a new fraction as that simplification.
 */
public class Fraction
{
	private int num; //numerator
	private int den; //denominator
	
	//For printing objects
	public String toString()
	{
		return ("" + num + "/" + den); 
	}
	
	//Constructor
	public Fraction(int num, int den)
	{
		this.num = num;
		this.den = den;
	}
	
	private void reduce()
	{
		int i = Math.min(Math.abs(num),Math.abs(den));
		if(i == 0)
			return;
		while((num % i != 0) || (den % i != 0))
			i--;
		num = (num / i);
		den = (den / i);
	}
	
	//Produce reciprocal of fraction
	public Fraction recip()
	{
		return new Fraction(den, num);
	}
	
	//Add 2 fractions
	public Fraction add(Fraction other)
	{	
		int d = (this.den * other.den);
		int n1 = (this.num * other.den);
		int n2 = (other.num * this.den);
		Fraction f = new Fraction(n1 + n2, d);
		f.reduce();
		return f;
	}
	
	//Subtract 2 fractions
	public Fraction subtract(Fraction other)
	{
		int d = (this.den * other.den);
		int n1 = (this.num * other.den);
		int n2 = (other.num * this.den);
		Fraction f = new Fraction(n1 - n2, d);
		f.reduce();
		return f;
	}
	
	//Multiply 2 fractions
	public Fraction mult(Fraction other)
	{
		Fraction result = new Fraction(this.num * other.num, this.den * other.den);
		result.reduce();
		return result;
	}
	
	public Fraction div(Fraction other)
	{
		Fraction result = new Fraction(this.num * other.den, this.den * other.num);
		result.reduce();
		return result;
	}

	public static void main(String[] args)
	{	
		//Enter fraction 1 and fraction 2
		Fraction newFraction = new Fraction(1, 2);
		Fraction otherFraction = new Fraction(2, 3);
		
		//Add fractions results
		Fraction a = newFraction.add(otherFraction);
		System.out.println(newFraction + " + " + otherFraction + " = " + a);
		
		//Subtract fractions results
		Fraction s = newFraction.subtract(otherFraction);
		System.out.println(newFraction + " - " + otherFraction + " = " + s);
		
		//Multiply fractions results
		Fraction m = newFraction.mult(otherFraction);
		System.out.println(newFraction + " * " + otherFraction + " = " + m);
		//newFraction.lcm(otherFraction.den)
		
		//Divide fractions results
		Fraction d = newFraction.div(otherFraction);
		System.out.println(newFraction + " / " + otherFraction + " = " + d);
		
		//Reciprocal of fractions results
		Fraction r1 = newFraction.recip();
		System.out.println("The reciprocal of " + newFraction + " is " + r1);
		
		Fraction r2 = otherFraction.recip();
		System.out.println("The reciprocal of " + otherFraction + " is " + r2);
		
	}

}
