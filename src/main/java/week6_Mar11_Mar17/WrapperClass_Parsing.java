package week6_Mar11_Mar17;

public class WrapperClass_Parsing {
	
	// Parsing - logical form of understanding of how to read the value of one object when it gets converted into
	// another type.
	
	public static void main(String[] args) {
		
		String price1 = "12.98";
		String price2 = "7.70";
		
		System.out.println(price1 + price2); //Does't actually add but only concatenates.
		// int result = price1 + price2; // Can't do that sum because it can't convert String data type to integer
										 // data type.
		
		// Solution for this is as follows. 
		
		double p1 = Double.parseDouble(price1);
		double p2 = Double.parseDouble(price2);
		
		double sum = p1+p2;
		
		System.out.println(sum);
	}

}
