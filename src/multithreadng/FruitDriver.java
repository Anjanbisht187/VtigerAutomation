package multithreadng;

public class FruitDriver {
	public static void main(String[] args) {
		 Fruit f1=new Fruit("mango",123,12.3);
		 Fruit f2=new Fruit("apple",123,12.3);
		 Fruit f3=new Fruit("pea",123,12.3);
		// Fruit f4=new Fruit("banana",123,12.3);
		   
		 
		 f1.start();
		 f2.start();
		 f3.start();
		 
		 
//	 f1.display();
//	 f2.display();
//		 f3.display();
	}

}
