package multithreadng;

public class FruitsDriver {
	
	public static void main(String[] args) {
		 Fruit f1=new Fruit("mango",123,12.3);
		 Fruit f2=new Fruit("apple",123,12.3);
		 Fruit f3=new Fruit("pes",123,12.3);
		 Fruit f4=new Fruit("banana",123,12.3);
		   
		 
		 Thread t1 = new Thread (f1);                   //b/c start() method inside Thread class only
		 Thread t2 = new Thread (f2);
		 Thread t3 = new Thread (f3);
		 Thread t4 = new Thread (f4);
		 
		 
		 f1.start();
		 f2.start();
		 f3.start();
		 
		 
//		 f1.display();
//		 f2.display();
//		 f3.display();
	}


}
