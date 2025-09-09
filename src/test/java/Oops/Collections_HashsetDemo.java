package Oops;

import java.util.ArrayList;
import java.util.HashSet;

public class Collections_HashsetDemo {

	public static void main(String[] args) {
		HashSet myset=new HashSet();
		
		myset.add(45);
		myset.add("java");
		myset.add("True");
		myset.add("False");
		
		System.out.println(myset);
		
		System.out.println("No of elements:" + myset.size());
		
		for(Object item: myset)
		{
			System.out.println(item);
		}
		
		//get 2nd element
		//convert set into Array
	Object [] mysetarray=myset.toArray();
	System.out.println("2nd elementis :" + mysetarray[1]);
	
	// convert set to ArrayList
	ArrayList myList=new ArrayList(myset);
	System.out.println("3rd element is: "+ myList.get(2));
			
	}

}
