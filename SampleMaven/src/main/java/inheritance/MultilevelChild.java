package inheritance;

public class MultilevelChild extends MultilevelParent{
	public void childmethod()
	{
		System.out.println("Child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelChild obj=new MultilevelChild();
		obj.grandparentmethod();
		obj.parentmethod();
		obj.childmethod();
		

	}

}
