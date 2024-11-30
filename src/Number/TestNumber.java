package Number;

public class TestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number number = new Number(153);
		System.out.println("Is zero: " + number.isZero());
		System.out.println("Is positive: " + number.isPositive());
		System.out.println("Is negative: " + number.isNegative());
		System.out.println("Is odd: " + number.isOdd());
		System.out.println("Is even: " + number.isEven());
		System.out.println("Is prime: " + number.isPrime());
		System.out.println("Is Armstrong: " + number.isAmstrong());
		System.out.println("Factorial: " + number.getFactorial());
		System.out.println("Square Root: " + number.getSqrt());
		System.out.println("Square: " + number.getSqr());
		System.out.println("Sum of digits: " + number.sumDigits());
		System.out.println("Reverse: " + number.getReverse());
		number.listFactor();
		number.dispBinary();

	}

}
