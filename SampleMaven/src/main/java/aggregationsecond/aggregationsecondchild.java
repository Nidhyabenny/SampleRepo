package aggregationsecond;

public class aggregationsecondchild {

	String city;
	String state;
	aggregationsecondparent ref;

	public aggregationsecondchild(String city,String state, aggregationsecondparent ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	public void print()
	{
		System.out.println(ref.name);
		System.out.println(ref.rollno);
		System.out.println(ref.address);
		System.out.println(city);
		System.out.println(state);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aggregationsecondparent obj=new aggregationsecondparent("nidh",5,"lane");
		aggregationsecondchild obj2=new aggregationsecondchild("tvm","kerala",obj);
		obj2.print();

	}

}

