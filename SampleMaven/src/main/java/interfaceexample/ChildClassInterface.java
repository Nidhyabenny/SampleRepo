package interfaceexample;

public class ChildClassInterface implements ParentInterface{   //Here we add implements not extends
																//Always hover childclass red underline->Add unimplemented methods

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassInterface obj=new ChildClassInterface();
		obj.print();
		obj.display();
		obj.show();   //so using this child object we can call this child class methods
						// and also interface methods
		
		
		//Reference Creation
		//InterfaceName objectname=new Classname ----> SYNTAX
		ParentInterface obj1=new ChildClassInterface();
		obj1.display();
		obj1.print();  //
		
	}

@Override
public void print() {
	// TODO Auto-generated method stub
	System.out.println("Printing 1");
}

public void show()
{
	System.out.println("Child Class non abstract method");
}

@Override
public void display() {
	// TODO Auto-generated method stub
	System.out.println("Printing 2");
}

}
