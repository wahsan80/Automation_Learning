package week9_Jun17_Jun23;

public class Java_Basics_Inc_Dec_Operators {
	
	public static void main(String[] args) {
		
		int i = 1;
		int j = i-- - --i;
		//  j = 1 - (-1) = +2
		//  i = first 0 then -1
		
		System.out.println(j);
		System.out.println(i);	
		
		int k = i-- - ++j - j-- - --j + j++;
		int l = i++ + ++i - --i + k-- - --k;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println("==========");
		 
		int a = 1;
		int b = a++;
		
		System.out.println("Value of b in row number 9 is : " + b);
		System.out.println("Value of a in row number 9 is : " + a);
		
		b = a++ + a++;
		
		System.out.println("Value of b in row number 13 is : " + b);
		System.out.println("Value of a in row number 13 is : " + a);
		
		b = ++a + a++ + ++a;
		
		System.out.println("Value of b in row number 19 is : " + b);
		System.out.println("Value of a in row number 19 is : " + a);
		
		b = a++ + ++a + a++ + ++a;
		
		System.out.println("Value of b in row number 25 is : " + b);
		System.out.println("Value of a in row number 25 is : " + a);
		
		b = a--;
		
	}

}
