package week3_Jan15_Jan21;

public class Increment_Decrement_Operator_Exercise2 {
	
	public static void main (String[] args) {
		
		int i = 1;
		int j = ++i 				 - --i;
		//  j = +1+1 (i becomes 2) - -1+2 (i becomes +1)
		//  j = 2 					 - 1 while i = 1
		//  j = 1 while i = 1
		
		int k = j-- - --i + i-- - --j;
		//  k = 1   - 0   + 0   - -1
		//  k = 1 - -1
		//  k = 2, j = -1, i = -1
		
		int l = --k - k-- + i-- - --i + j++ - j--;
		//  l = 1   - 1   + (-1)- (-3)+ (-1)- 0
		//  l = 0         + (-1)- (-3)+ (-1)- 0
		//  l = -1              - (-3)+ (-1)- 0
		//  l = -1              + 3   + (-1)- 0
		//  l = +2                    +(-1)- 0
		//  l = +1                         - 0
		//  l = +1
		//  i = -3, j = -1, k = 0, l = 1
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
		System.out.println("k = " + l);
		
	}

}
