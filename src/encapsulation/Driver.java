package encapsulation;

public class Driver extends Employ {
   public static void main(String[] args) {
	Employ e1 = new Employ();
	e1.getEname();
	System.out.println();
	e1.setEname("mohan");
	System.out.println(e1.ename);

	 
	 
   }

}
