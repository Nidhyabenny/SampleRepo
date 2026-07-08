package exceptionhandling;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0,x;
		try {
		x=a/b;
		}
		catch(ArithmeticException e) {
			b=2;
			x=a/b;
			System.out.println(x);
			System.out.println(e);
			
		
		}
		

	}

}
