package SuperCall;
 
public class Car extends vehical{
	
	String colour;
	String type1;
	String model;
	Car()
	{
		
	}
	Car ( String type,double weight,double price,String colour,String type1, String model)
	{ 
		
		super(type,weight,price);
//		super.type=type;
//	    super. weight =weight;
//	    super.price= price;
	    this .colour=colour;
		this.type1 =type1;
		this.model=model;
	}
	
	public static void demo()
	{
		System.out.println("child demo car method is start");
	}
	
	public void test()
	{
		System.out.println("child car test method is start");
	}
	
	
	public void display()
	{   
		System.out.println("car tpye is: "+colour);
		System.out.println("car weight is: "+type);
		System.out.println("car price is: "+model);
		System.out.println("car color is: "+colour);
		System.out.println("car type is: "+type);
		System.out.println("car model is: "+model);
	}
}
 