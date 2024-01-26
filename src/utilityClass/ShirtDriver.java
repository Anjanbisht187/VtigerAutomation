package utilityClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Achieving Shorting
public class ShirtDriver {
public static void main(String[] args) {
	List<Shirt> l1 = new ArrayList<Shirt>();
	Shirt s1 = new Shirt("Arrow",40,3400,"Blue");
	l1.add(s1);
	l1.add((new Shirt("Lp",42,4400,"Black")));
	l1.add((new Shirt("BlackBerry",42,4400,"Pink")));
	l1.add((new Shirt("Arrow",42,4400,"Green")));
	l1.add((new Shirt("Levis",42,4400,"Orange")));
	l1.add((new Shirt("Raymond",44,4300,"Black")));
	l1.add((new Shirt("Raymond",38,4200,"Yellow")));
	l1.add((new Shirt("Lp",42,4000,"Black")));
	System.out.println("Access All Shirt Items========================>");
	
	for(Shirt s: l1)
	{
		System.out.println(s);
	}
	
	Collections.sort(l1);
	System.out.println("Access all the Items sorted on Size================> "+l1);
	
	for(Shirt p:l1)
	{
		System.out.println(p);
	}
}
}
