package exceptionhandling; //exceptionHandling

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0,x;
		try {
		x=a/b;
		}
		/*catch(ArithmeticException e) {  //catch will hold that exception, if needed we can display that exception 
			b=2;
			x=a/b;
			System.out.println(x);
			System.out.println(e); //will print the exception
			
		
		}*/ 
		//Now we will comment catch. 
		finally {
			System.out.println("Inside Finally -mandatory Code");  //This will get printed anyway even if exception is not handled
																	//(catch disabled)
		}
		

	}

}
