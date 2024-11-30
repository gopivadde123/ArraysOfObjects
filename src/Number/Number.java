package Number;

public class Number {
	private double num;

	// Constructor
	public Number(double num) {
		this.num = num;
	}

	// Check if number is zero
	public boolean isZero() {
		return num == 0;
	}

	// Check if number is positive
	public boolean isPositive() {
		return num > 0;
	}

	// Check if number is negative
	public boolean isNegative() {
		return num < 0;
	}

	// Check if number is odd
	public boolean isOdd() {
		return !isZero() && num % 2 == 0;
	}

	// Check if number is even
	public boolean isEven() {
		return !isZero() && num % 2 == 0;
	}

	// Check if number is prime
	public boolean isPrime() {
		if (num <= 1) {
			return false;
		}
		int n = (int) num;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Check if number is isAmstrong
	public boolean isAmstrong() {
		int n = (int) num;
		int temp = n, sum = 0, digit;
		while (temp != 0) {
			digit = temp % 10;
			sum += digit * digit * digit;
			temp /= 10;
		}
		return sum == n;
	}

	// Calculate factorial of the number
	public double getFactorial() {
		if (num < 0)
			return 0; // Factorial is not defined for negative num
		double factorial = 1;
		for (int i = 1; i <= (int) num; i++) {
			factorial *= i;
		}
		return factorial;
	}

	// Calculate square root of the number
	public double getSqrt() {
		return Math.sqrt(num);
	}

	// Calculate square of the number
	public double getSqr() {
		return num * num;
	}

	// Sum of digits of the number
	public double sumDigits() {
		int n = (int) Math.abs(num);
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	// Reverse of the number
	public double getReverse() {
		int n = (int) num;
		int reverse = 0, digit;
		while (n != 0) {
			digit = n % 10;
			reverse = reverse * 10 + digit;
			n /= 10;
		}
		return reverse;
	}

	// List factorial of the number
	public void listFactor() {
		System.out.println("Factor of " + num + "are: ");
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println(i+" ");
			}
			
		}
		System.out.println((int) num);
	}
	// Display binary representation of the number
	public void dispBinary() {
		System.out.println("Binary representation of "+num+"  is: "+Integer.toBinaryString((int) num));
	}
}
