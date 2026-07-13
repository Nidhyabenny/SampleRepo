package inheritance;

public class MultipleChild implements MultipleParent1, MultipleParent2{
	//Parents are interface, child is class
	//now to inherit we cant use EXTENDS keyword . This is interface 
	//Therefore we can use IMPLEMENTS
	//Click on red underline error-->Implement methods option
	
	public void print3()
	{
		System.out.println("Inside Multiple Child Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleChild obj=new MultipleChild();
		obj.print1();
		obj.print2();
		obj.print3();

	}

	@Override
	public void print2() {
		// TODO Auto-generated method stub
		System.out.println("Inside Interface parent2");
	}

	@Override
	public void print1() {
		// TODO Auto-generated method stub
		System.out.println("Inside Interface parent1");
		
	}

}
