package week3_Jan15_Jan21;

public class Leap_Year_Ex {
	
	public static void main(String[] args) {
	
		for (int Leap_Year = 2020; Leap_Year <= 2025; Leap_Year++) {
			if (Leap_Year % 4 == 0)
				System.out.println(Leap_Year + " is a Leap Year.");
			else
				System.out.println(Leap_Year + " is not a Leap Year");
		}
	}
}
