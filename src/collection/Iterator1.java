package collection;
//<---------Methods of collection( to perform CRUD Operaion)----------->
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Iterator1 {
	private static final String Integer = null;

	public static void main(String[] args) {
		
		//<--------ToAdd-------------------1.add(object)----we can add 1-object at a time into a collection--------->
		Collection c = new ArrayList();
		c.add(12);
		c.add("mohan");
		c.add(14);
		c.add(12.4);
		c.add(45.6);
		c.add(34);
		c.add(234);
		c.add("123");
		System.out.println("here one collection is created : " + c);
		System.out.println("<---------------------add()method end--------------------->");
		// <--------------2.addAll(collection )-------------we can add all the element
		// of 1 collection into another collection----------->

		Collection c1 = new ArrayList();
		c1.add("ram");
		System.out.println("c1 before adding a new collection :" + c1);
		c1.addAll(c);
		System.out.println("c1 after adding c colection : " + c1);
		System.out.println("<-------------------------------------->");
		// <--------------------to Remove---------------------------->
		// <-------------------1.remove(object)------we can remove 1-object at a time
		// into a collection--------------->

		c.remove("mohan");
		System.out.println(c);
		// <----------------------------------2.removeAll(collection)------------------------------------>
		Collection c3 = new ArrayList();
		c3.add("Automation");
		c3.add("java");
		c3.add("manual");
		c3.add("api");
		System.out.println("here new collection is created : " + c3);
		c3.addAll(c1);
		c3.addAll(c);
		System.out.println(c3);
//		      c3.removeAll(c1);
//		      System.out.println(c3);

		// <-------------------3.retainAll(collection)------------>
		c3.retainAll(c1);
		System.out.println("after retainn all : " + c3);

		// <---------------------clear()-------------->
		c.clear();
		System.out.println(c);
		
		//<----------------------------ToSearch------------------->
		//<------------------------contains(object)--------------->
		Collection object = new ArrayList();
		object.add("string");
		object.add("Integer");
		boolean b = object.contains("string");
		if (b)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		//<------------------containsAll(collection)-------------->
		Collection object2 = new ArrayList();
		 object2.add("string");
		 object2.add("automation");
		 object2.add("123");
		boolean bb = object2.containsAll(object);
		 System.out.println(bb);
		 
		 //<----------------4.size()------------------------->
		 Collection collection = new ArrayList();
		 collection.add("java");
		 collection.add("manual");
		 collection.add(1223);
		 collection.add("232");
		 System.out.println(collection.size());
		 
		             String ss = collection.toString();
		             System.out.println(ss);
		             System.out.println(ss.length());
		             
         //<-----------------5.toArray()-------------------------->
		             Object [] a = collection.toArray();
		             System.out.println(a);
		             System.out.println(a.length);
		             for(int i = 0;i<a.length;i++)
		             {  
		            	 if(a[i]instanceof Integer)
		            	 System.out.println(a[i]);
		             }
		             
		  //<----------------6.isEmpty()---------------------->
		       boolean check= collection.isEmpty();
		       System.out.println( "isEmpty or not : "+check);
		             
		 //<------------------------7.equals()------------------------->
		     boolean bbb=  c.equals(c3);
		     System.out.println(bbb);
		System.out.println("<------------------------------------->"); 
		 
		 String s = new String ("mohan");
		     System.out.println(s.charAt(1)); 
		       s.charAt(2);
		       System.out.println(s.length());

		
		 
		
		

		// <----System.out.println("collection stored object type of data /datatype is =
		// Objeect like car,t-shirt");
//		//<--------here parent type object is stored in child class ref so we need to downcast operator >
//		Iterator itr = (Iterator) c.iterator();
//		//<-------Here object type data we have like Sting ,int ,char.double-------->
//		while((Object) itr).hashnext())          //boolean type
//		{
//			sum=sum+(Integer)itr.next();
//		}
//		

	}

}
