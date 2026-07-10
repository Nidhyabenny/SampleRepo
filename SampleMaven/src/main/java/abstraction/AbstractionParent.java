package abstraction;

public abstract class AbstractionParent {
	public void print()    //Non abstract method; body visible
	{
		System.out.println("Abstraction method");
	}
	public abstract void display(); //no body 
	abstract void name();

}
