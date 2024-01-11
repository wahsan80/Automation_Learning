package week2_Jan08_Jan14;

public class Increment_Operator_Exercise {

	public static void main(String[] args) {

		// Find the final value of i, j, k and l
		
		int i = 1;
		
		int j = i++            + ++i; 
		//  j = 1(i becomes 2) + (i becomes = 3) 
	    //  j = 1		       + 3
		//  j = 4
		
		//int k = ++j + j++;
		
		//int l = k++ + ++k + k++ + i++;
		
		System.out.println(i);
		System.out.println(j);
		//System.out.println(k);
		//System.out.println(l);

	}

}
