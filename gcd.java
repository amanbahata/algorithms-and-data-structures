public class Gcd{


// Static method that uses recursion to calculate the great common devisor of two integers
	public static int gcd(int a, int b) throws IllegalArgumentException {
		if (a == 0 || b == 0) {
			throw new IllegalArgumentException();
		}
		int reminder;
		if (a > b) {
			reminder = a % b;
		}else{
			reminder = b % a;
		}
		if (reminder == 0) {
			return b;
		}
		return gcd(b,reminder);
	}
}