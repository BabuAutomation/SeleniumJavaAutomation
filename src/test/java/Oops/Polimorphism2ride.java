package Oops;

public class Polimorphism2ride extends Polymorphism1ride{
	
	//Override
	void showB()
	{
		System.out.println("Battery");
	}
	
	
	public static void main(String[] args) {
		
		
		Polymorphism1ride PL=new Polymorphism1ride();
		PL.showA();
		PL.showB();
		PL.showC();
		
		System.out.println("=========");
		
		Polimorphism2ride OL1=new Polimorphism2ride();
		OL1.showA();
		OL1.showB();
		OL1.showC();
		
	}

}
