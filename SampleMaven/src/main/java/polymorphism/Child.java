package polymorphism;

public class Child extends Parent {
	public void print(int a,int b)
	{
		System.out.println(a-b);
		super.print(10, 5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.print(10,5);

	}

}
