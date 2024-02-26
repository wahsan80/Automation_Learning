package week3_Jan15_Jan21;

public class Prime_Numbers {
	
	static int i = 2;

	public static void main(String[] args) {
		
		// WAP to determine whether this number is a prime number or not - use for loop
		// A prime number is a number that can only be divided by itself and 1 without remainders.
		
		if (isPrime(7)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
	}
	
	// Function checks whether a number is prime or not
	
    public static boolean isPrime(int n)
    {
        // Corner cases
        if (n == 0 || n == 1) {
            return false;
        }
        // Checking Prime
        if (n == i)
            return true;
        // Base cases
        if (n % i == 0) {
            return false;
        }
        i++;
        return isPrime(n);
    }
}
