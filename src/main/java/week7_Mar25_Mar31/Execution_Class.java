package week7_Mar25_Mar31;

public class Execution_Class {
	
	public static void main(String[] args) {
		
		GrandParent_Class gp = new GrandParent_Class();
		gp.gold();
		gp.cash();
			
		Parent_Class parent = new Parent_Class();   // Uni/Single Level Inheritance (Super Class to Sub Class)
		parent.bungalow();
		parent.farmhouse();
		parent.gold();
		parent.cash();		
		
		Child_Class child = new Child_Class();
		child.guitar();                      //Multi-Level (GrandParen to Parent to Child) Inheritance
		child.superCar();
		child.farmhouse();
		child.bungalow();
		child.cash();
		child.gold();
		// child.box();   cannot extend a Private method of the parent class
        child.ngo();
        
	}

}
