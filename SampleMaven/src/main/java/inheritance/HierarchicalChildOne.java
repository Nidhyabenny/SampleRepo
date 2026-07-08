package inheritance;

public class HierarchicalChildOne extends HierarchicalParent{
	public void childonemethod()
	{
		System.out.println("Child One");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalChildOne obj=new HierarchicalChildOne();
		obj.parentmethod();
		obj.childonemethod();

	}

}
