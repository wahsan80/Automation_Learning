package week11_Jul29_Aug04;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections_Understanding {
	
	public static void main (String[] args) {
		
		String[] news = new String[105]; // 	
		
		int[] arr = {1,2,3,4,5};
		
		/*
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("Selenium");
		al.add('c');
		
		System.out.println(al.size()); // Need to understand.
		*/
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("1");
		al.add("Selenium");
		al.add("c");
		
		System.out.println(al.size()); // Need to understand. 
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("101", "ABC");
		hm.put("102", "ABCD");
		hm.put("103", "ABCDE");
	}

}
