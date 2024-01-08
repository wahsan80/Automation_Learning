package week2_Jan08_Jan14;

public class Concatenation_Operator { //Concatenation is joining not adding. 
	
	/*Concatenation in the Java programming language is the operation of joining two strings together. You can
	 * join strings using either the addition (+) operator or the String's concat() method.
	 */

	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		System.out.println(i + j); //Doing addition not concatenation
		
		char c1 = 'a'; // ascii value
		char c2 = '1';
		System.out.println(c1 + c2); //How come 146? askii value? Doing addition not concatenation
		
		String name1 = "Karina";
		String name2 = "Mina";
		System.out.println(name1 + name2); //Concatenating
		
		System.out.println(i+j+name1+name2);
		System.out.println(name1+name2+i+j); //Why it didin't add i+j? 
		//Precedence matter. When addition is first then it does the addition first and then concatenates.
		//When concatenation is first then it doesn't do the addition. 
		System.out.println(name1+name2+(i+j));
		
		//https://www.geeksforgeeks.org/difference-between-concat-and-operator-in-java/
		//Good reference point for additional learning

	}

}
