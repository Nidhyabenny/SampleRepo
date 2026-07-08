package accessModifier;

public class Access2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 obj=new Access1();
		obj.display1();
		obj.display3();
		obj.display4();
		//obj.display2(); //This cant be called. because this method in other class Access1 was set as PRIVATE. 
		//PRIVATE can be used only within same class.
		

	}

}
