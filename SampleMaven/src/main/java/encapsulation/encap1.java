package encapsulation;

public class encap1 {    //details are protected inside encap1
	private String name;
	private int age;
	
	public void setter(String name, int age)//To set values
	{
		this.name=name;
		this.age=age;
	}
	
	public void getter()//to get values
	{
		 System.out.println(name);
		 System.out.println(age);
	}

}
