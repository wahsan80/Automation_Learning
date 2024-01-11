package week2_Jan08_Jan14;

public class Increment_Operator {

	public static void main(String[] args) {
		
		int i = 100;
		
		System.out.println("i before any operation = " + i);
		
		int j = i++; // Assign the value of i, which is 100, to j and then increase the value of i by 1
		
		System.out.println("j = i which is " + j); // j = 100
		System.out.println("i incremented by 1 due to operator ++ so became " + i); // i = 101
		
		int k = j++; //k becomes 100, j becomes 101
		
		System.out.println("Value of k = " + k);
		
		int l = k++; // l becomes 100, k becomes 101
		
		System.out.println("Value of l = " + l);
		
		System.out.println("Final Value of i = " + i); //101
		System.out.println("Final Value of j = " + j); //101
		System.out.println("Final Value of k = " + k); //101
		System.out.println("Final Value of l = " + l); //100
		
		System.out.println("***********************************");
		
		int m = 1; 
		
		System.out.println("m = " + m);
		int n = ++m; // Assign the value of m to n but first increase the value of m by +1. 
					 // m=1+1=2. n is assigned the value of 2
		
		System.out.println("n = " + n);
		System.out.println("m = " + m);
		
		int o = ++n; // Same Operations as above
		
		System.out.println("o = " + o);
		
		int p = ++o; // Same operations
		
		System.out.println("p = " + p);
	}

}
