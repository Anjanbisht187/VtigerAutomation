package object;

public class EmployDriver {
	public static void main(String[] args) {
		Employ e1= new Employ( "mohan",9,26000,9);
		System.out.println("add is : "+e1);
		e1.display();
		e1.actualSalary();
	}
}

