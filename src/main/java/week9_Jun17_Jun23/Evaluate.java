package week9_Jun17_Jun23;


// A normal Class can extend another Class as well as implement multiple interfaces

public class Evaluate extends Abstraction_Concept implements Introduction, IntroductionPart2{
	
	public static void main(String[] args) {
		
		Evaluate ev = new Evaluate();
		ev.display();
		ev.display1();
		ev.someThing();
		
		Introduction intro = new Evaluate();
	}	
	
	@Override
	public void display() {
		
		
	}
	@Override
	public void display1() {
		
		
	}
	@Override
	public void launchUrl() {
		
		
	}
	@Override
	public void tearDown() {
		
		
	}
	@Override
	public void displayLogic2() {
		
		
	}

	@Override
	public void displayLogic3() {
		
		
	}

	@Override
	protected void displayLogic5() {
		
		
	}

	@Override
	void displayLogic6() {
	
		
	}
}
