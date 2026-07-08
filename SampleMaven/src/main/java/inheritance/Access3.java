package inheritance;

import accessModifier.Access1;

public class Access3 extends Access1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 obj=new Access1(); //Access1 has to be imported to Access 3 --
		//obj.display1();
		//obj.display3();
		Access3 obj2=new Access3();
		obj2.display1();
		obj2.display3();
		

	}

}
