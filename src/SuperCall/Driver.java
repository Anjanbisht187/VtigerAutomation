package SuperCall;

public class Driver {
	public static void main(String[] args) {
		
		Car c = new Car("bus", 123.4, 12.345, "red", "car", "11234ab");
		System.out.println("Address of an  car object is" + c);
		System.out.println(c.type);
		c.display();

		// <-----concept of method overriding and method shadowing---------->
		//<-------- when there are non-static method in P&C class with same name execution will happen according to object that is  Method overriding

		vehical v1 = new Car();
		v1.test();
		
		//<-------- when there are static method in P&C class with same name execution will happen according to veriable ref that is  Method shadowing
		vehical v2 = new Car();
		v2.demo();

	}

}
