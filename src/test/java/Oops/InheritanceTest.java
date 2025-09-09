package Oops;

public class InheritanceTest {

	public static void main(String[] args) {
		
	
		A InhA=new A();
		InhA.ShowA();
		
		System.out.println("=======");
		B InhB=new B();
		InhB.ShowA();
		InhB.ShowB();
		
		System.out.println("=======");
		C InhC=new C();
		InhC.ShowA();
		InhC.ShowB();
		InhC.ShowC();
	}

}
