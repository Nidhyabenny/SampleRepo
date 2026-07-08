package inheritance;

public class HierarchicalChildTwo extends HierarchicalParent{
	public void childtwomethod()
	{
		System.out.println("Child Two");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalChildTwo obj=new HierarchicalChildTwo();
		obj.parentmethod();
		obj.childtwomethod();

	}

}
