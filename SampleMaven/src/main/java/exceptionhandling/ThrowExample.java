package exceptionhandling; //ExceptionHandling

public class ThrowExample {
	
	public static void main(String args[])
	{
		int age=10;
		try {
		if(age>18)
		{
			System.out.println("Voting Eligble");
		}
		else {
			throw new ArithmeticException("Not eligble to vote");
		}
		}
		finally
		{
			System.out.println("Election Done");
		}
			
			
	}

}
