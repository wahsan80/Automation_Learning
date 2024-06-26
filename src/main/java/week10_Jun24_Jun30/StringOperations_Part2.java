package week10_Jun24_Jun30;

public class StringOperations_Part2 {
	
	public static void main(String[] args) {
	
		// Strings can be updated using methods
	
		// replace()
		String S1 = "I am learning Selenium";
		System.out.println(S1.replace("am", "am not"));	
		
		String S2 = "Can an animal run";
		System.out.println(S2);
		System.out.println(S2.replace("an", "some")); // Replaced all 'an' in the String
		
		// replaceFirst()
		System.out.println(S2.replaceFirst("an", "some"));
		
		// replaceAll() - can work with regular expressions whereas replace() can't.
		System.out.println(S2.replaceAll("an", "some")); 
		System.out.println(S2.replaceAll("an(.)", "add")); //?
		System.out.println(S2.replaceAll("an(.*)", "add")); //?
		
		// Strings can be searched using certain methods
		
		// indexOf()
		String S3 = "Seleniumefefefe";
		System.out.println(S3.indexOf(6)); // Interview Question
		System.out.println(S3.indexOf('m'));
		System.out.println(S3.indexOf("ium")); //Starting index is 5
		
		// lastIndexOf()
		System.out.println(S3.lastIndexOf('e'));
		System.out.println(S3.lastIndexOf("fef"));
		
		// charAt()
		System.out.println(S3.charAt(14));
		
		// contains()
		System.out.println(S3.contains("f")); // returns boolean - true
		
		// endsWith()
		System.out.println(S3.endsWith("fefe")); // boolean return
		
		// startsWith()
		System.out.println(S3.startsWith("Sele")); // boolean return
		
		// Case conversion methods
		
		// toLowerCase()
		String S4 = "DancingmonkEY";
		System.out.println(S4.toLowerCase());
		
		// toUpperCase()
		System.out.println(S4.toUpperCase());
		
		// Type Conversion Methods
		
		// valueOf()		
		int i = 1;
		int j = 2;
		System.out.println(i + j);
		
		String S5 = String.valueOf(i); // converts primitive data type into String 
		String S6 = String.valueOf(j);
		System.out.println(S5);
		System.out.println(S6);
		System.out.println(S5 + S6); // 12
		
		// toCharArray()
		char[] ch = S4.toCharArray(); // Converting String to Char Array
		System.out.println(ch);
	}
}
