package object;

public class Employ {
	String name;
	double salary;
	int id;
	int leave;
	public Employ (String name, int leave,double salary, int id) {
		
		this.name=name;
		this.leave=leave;
		this.salary=salary;
	this.id=id;
	
	}
public void display() {
System.out.println(" emp name is:"+name)	;
System.out.println("salary is:"+salary);
System.out.println("id is:"+id);
System.out.println("total leaves are:"+leave );
System.out.println("===============================");

}
public void actualSalary() {
	
	double salaryDedu= (salary/30)*leave;
	System.out.println("actual salary after deduction:"+(salary-salaryDedu)+"Rs.");
	
	
}
}
