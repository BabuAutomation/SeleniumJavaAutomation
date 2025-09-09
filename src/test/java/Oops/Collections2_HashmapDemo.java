package Oops;

import java.util.HashMap;
import java.util.Set;

public class Collections2_HashmapDemo {

	public static void main(String[] args) {
		
		HashMap myMap=new HashMap();
		
		myMap.put("eName", "Ravi");
		myMap.put("Salary", 50000);
		myMap.put("Titele", "Tester");
		myMap.put("eID", 5678);
		
		System.out.println("No of elements:" + myMap.size());
		System.out.println(myMap);
		
		System.out.println("key value of Salary:" + myMap.get("Salary"));
		
		myMap.put("eName", "Babu");
		System.out.println(myMap);
		
		System.out.println("=============");
		Set mySet=myMap.keySet();
		for(Object item : mySet)
		{
			System.out.println("Key:'" + item +"': Value is:" + myMap.get(item));
		}

	}

}
