package week2_Jan08_Jan14;

public class Increment_Operator_Exercise {

	public static void main(String[] args) {

		// Find the final value of i, j, k and l - Exercise
		
		// var++ = Assign/Use the value first then increase by +1
		// ++var = Increase the value first by +1 then use/assign the value
		// var-- = Assign/Use the value first then decrease by -1
		// --var = Decrease the value first by -1 then use/assign the value
		
		int i = 1;
		
		int j = i++            + ++i; 
		//  j = 1(i becomes 2) + (i becomes = 3) 
	    //  j = 1		       + 3
		//  j = 4
		
		int k = ++j             + j++;
		//  k = (j becomes 5) 5 + (j = 5) 5 (j becomes 6)
		//  k = 5 + 5 while j = 6
		//  k = 10 while j = 6
		
		int l = k++ 								+ ++k 			 + k++ 			 	   + i++;
		//  l = (l becomes 10) while (k becomes 11) + (k becomes 12) + (k = 12 becomes 13) + (i = 3 becomes 4)
		//  l = 10 + 12 + 12 + 3 while i = 4
		//  l = 38 while i = 4
		//  i = 4, j = 6, k = 13, l = 38
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
		System.out.println("l = " + l);

	}

}
