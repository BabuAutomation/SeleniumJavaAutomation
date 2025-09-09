package Oops;

import java.util.ArrayList;

public class collections1_ArraylistDemo {

	public static void main(String[] args) {
		 ArrayList mylist=new ArrayList();
				
		 mylist.add(10);
		 mylist.add(20);
		 mylist.add(100);
		 mylist.add(200);
				 
		 System.out.println( mylist);
		 
		 //Size
		 System.out.println("arraylist size is:" + mylist.size());
		 
		 System.out.println("The elements are");
		 printList(mylist);
		 
		 System.out.println("==========");
		 
		 //get
		 System.out.println("3rd index numbser is:" + mylist.get(3));
		 
		 //modify 2 element
		 mylist.set(1, 50);
		 System.out.println("after modify 2nd element");
		 printList(mylist);
		 
		 System.out.println("==========");
			 
		// add(index, item)
			 mylist.add(1, 50.5);
			 System.out.println("after inser 2nd element");
			 printList(mylist);
			 
			 System.out.println("==========");
			 
			 //Remove
			 mylist.remove(3);
			 System.out.println("remove 3rd element");
			 printList(mylist);		 		 
	}

	public static void printList(ArrayList al)
	{
		 for(Object item : al)
		 {
			 System.out.println(item);
		 }
	}
}
