package Oops;

public class Polimorphism {
	
	//Overloading
	
		/*void A(int a)
		{
			System.out.println("Login");
		}

		void A()
		{
			System.out.println("Logout");
		}*/

	
		String name;
		int age;
		String course;
		Polimorphism()
		{
			name="unknown";
			age=0;
			course="not assigned";
		}
		
		Polimorphism(int a, String Name)
		{
			age=a;
			name="Name";
		}
		Polimorphism(int a, String Name, String c)
		{
			age=a;
			name="Name";
			course="co";
		}
		
		void display() {
			System.out.println("Name: " + name +", Age:" + age +", course: +co");
		}
	
		
	public static void main(String[] args) {
		
		Polimorphism OL=new Polimorphism();
		
		Polimorphism OL1=new Polimorphism(5, "Ravi");
		Polimorphism OL2=new Polimorphism(8, "Vedhu", "co");
		
		OL.display();
		OL1.display();
		OL2.display();
		
	}

}
