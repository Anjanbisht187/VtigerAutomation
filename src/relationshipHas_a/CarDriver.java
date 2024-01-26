package relationshipHas_a;

public class CarDriver {
	public static void main(String[] args) {
		Car c1 = new Car();
		 
		System.out.println("car object reference is :"+c1);
		c1.dispaycar();
		System.out.println("engine object reference is :" + c1.e);
		System.out.println("car name is : "+c1.name);
		System.out.println("car price is :"+c1.price);
		System.out.println("car engine type is :" + c1.e.type);
		//c1=null;
	}

}
