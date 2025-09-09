package Oops;


class A{
	
	void ShowA()
	{
		System.out.println("Open");
	}
	
}

// single inheritance(B extends A)
class B extends A{
	
	void ShowB()
	{
		System.out.println("search");
	}
	
}

// multilevel inheritance (B extends A, C extends B)
	
class C extends B{
	
	void ShowC()
	{
		System.out.println("Close");
	}

}
	

public class Inheritan {
	
	

	public static void main(String[] args) {
		

		
	}

}

