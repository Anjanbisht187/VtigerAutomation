package SuperCall;

public class vehical {
	
	String type;
	double weight;
	 double price;
	 
	 vehical()
	 {
		 
	 }
	 
     vehical (String type,double weight, double price)
     {
    	 this.type=type;
    	 this .weight=weight;
    	 this.price= price;
     }
     
     public  static void demo()
     {
    	 System.out.println("parent Vehival is Start");
     }
     public void test()
     {
    	 System.out.println(" parent demo of vehical is start");
     }
     
     
	 
     public void display()
     {
    	 System.out.println("Vehical type is: "+type);
    	 System.out.println("Vehical weight is: "+weight);
    	 System.out.println("vehical price is: "+price);
     }
}
