package Relationship;

public class Car {
	String name;
	double price;
	Engine e=new Engine("Petrol", 160,8);

	Car()
	{
		
	}
	Car(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
	Car(String name,double price,Engine e)
	{
		this.name=name;
		this.price=price;
		this.e=e;
	}
	public  void display()
	{
		System.out.println( "The name of car is :"+ name);
		System.out.println( "The price of car is :" + price);

	}
	public void start()
	{
		System.out.println("Car is started");
	}

}
a