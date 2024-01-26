package Relationship;

public class Driver {
	public static void main(String[]args)
	{// composition
	Car c1=new Car("TATA",3444455.5,new Engine());  
//      c1=null;
	c1.e.display();
		c1.display();
//		
		
		// aggregation

//       Car c1=new Car("TATA",3444455.5);
//       Engine e=new Engine("Petrol",125,9);
//       c1=null;
//       e.display();
//       c1.display();

		
	}

}
