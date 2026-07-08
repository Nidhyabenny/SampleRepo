package superkeyword;

public class SuperKeywordChild extends SuperKeywordParent {
	String color="Red";
	public SuperKeywordChild()
	{
		super();//Always call parent constructor from child constructor using SUPER keyword 
				//Always as first statement
		System.out.println("This is Child Constructor");
	}
	
	public void display()
	{
		System.out.println(color);
		System.out.println(super.color);
		
	}
	public void message()
	{
		System.out.println("Welcome from Child");
		super.message();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperKeywordChild obj=new SuperKeywordChild();
		obj.display();
		obj.message();
		
	}

}
