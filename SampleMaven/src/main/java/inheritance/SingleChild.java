package inheritance;

public class SingleChild extends SingleParent {
	public void show()
	{
		System.out.println("Single Child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleChild obj=new SingleChild();
		obj.display();
		obj.show();

	}

}
