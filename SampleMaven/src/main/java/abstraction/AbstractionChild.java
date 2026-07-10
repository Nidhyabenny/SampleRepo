package abstraction;

public class AbstractionChild extends AbstractionParent{
	//Hover over red line on Child Class
	//click on "Add unimplemented method"
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionChild obj = new AbstractionChild();  // create object

	    obj.print();    // calling non-abstract method from parent
	    obj.display();  // calling abstract method implemented in child
	    obj.name();     // calling abstract method implemented in child

	}

	@Override
	public void display() {     //Here we define abstract method declared in parent class
		// TODO Auto-generated method stub
		System.out.println("Abstract Printing ");
		
	}

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("Name Printing");		
		
	}
}
