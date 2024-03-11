package week6_Mar11_Mar17;

public class Arrays_Intro {
	
	public static void main(String[] args){
		
		// Arrays are an advanced level of programming. 
		// In Java, an array is a data structure that can store a fixed-size sequence of elements of the same
		// data type. An array is an object in Java, which means it can be assigned to a variable, passed as a 
		// parameter to a method, and returned as a value from a method.
		
		// [] This is a dimension of an Array. This is 1-D
		// [][] This is 2-D
		// [][][] This is 3-D
		// Arrays are divided into two types - One Dimensional Array and Multi-D Array (Matrix, Jagged)
		// Array's index position starts from 0
		// Array's takes up space in Heap Memory
		 
		//Advantages:-
		// 1. Arrays can store multiple values
		// 2. Faster compared to primitive data types because primitive data types use internal conversion of 
		//    Wrapper Classes
		// 3. They can store Objects as well
		
		// Disadvantages:-
		// 1. I am fixing the size of the array. Cannot increase or decrease size of the array at runtime
		// 2. Chances of memory wastage
		// 3. Can only store data of similar origin
		
		// Arrays are created at runtime
		// Elements of arrays can be stored at consecutive memory locations
		
		// There are 1000 students or employees in a company and want to store their stu_id, emp_id, student_name
		// emp_name
		
		int[] emp_id = new int[1000]; // Creating an object of an Array whose data type is 'int'
				
		String[] emp_name = new String[1000]; // Creating an object of an Array whose data type is 'String'
	}

}
