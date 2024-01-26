package relationshipHas_a;

public class Car {
	public static String  name ;
	double price;
	Engine e = new Engine ("petrol",160,8);
	
	Car ()
	{
		
	}
	Car (String name,double price)
	{
		this.name = name;
		this.price = price;
	}
	public void dispaycar ()
	{
		System.out.println("car name is:"+name);
		System.out.println("car price is : "+ price);
		
	//	System.out.println("engine type is:"+type);
	}
	
	
	
}
