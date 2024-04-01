package week7_Mar25_Mar31;

public class Child extends Method_Overriding {

	public static void main(String[] args) {
		Child child = new Child();
		
		child.cash(); // Child method
		child.office(); // Child method
		child.tender(); // Child method

		Method_Overriding mo = new Method_Overriding();
		
		mo.cash(); // Parent method
		mo.office(); // Parent method

		Method_Overriding mp = new Child();
		
		mp.office(); // Child method with reference of parent
		mp.cash(); // Child method with reference of parent

		/*
		 * Child childp = (Child) new Method_Overriding(); childp.cash();
		 * childp.office();
		 */
	}

	public void cash() {
		System.out.println("This is child's cash method");
	}

	public void office() {
		System.out.println("This is chid's office method");
	}

	public void tender() {
		System.out.println("This is child's tender method");
	}

}
