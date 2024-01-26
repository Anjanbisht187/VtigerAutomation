package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListMethod {
	public static void main(String[] args) {
	  
		List l = new ArrayList();
			l.add(12);
			l.add("maohan");
			l.add(14.6);
		 	l.add( 12.4);
			l.add( 45);
			l.add( 34);
			System.out.println("here one collection is created : "+l);
		System.out.println(l.get(4));
		
		for(int i=0;i<l.size();i++)
		{  if(!(l.get(i) instanceof Integer))
		
	     	{
			//System.out.println(l.get(i));
			l.remove(i);
			i--;
	     	}
		}
		System.out.println(l);
		//by for eeach loop
//		for(Object o: l)
//		{
//			System.out.println(o);
//		}
	

	}}
