package Oops;

 abstract class S1
{
	public abstract void D1();
	
	public void D2()
	{
		System.out.println("All are good from S1 class");
	}
}	

class S2 extends S1{
	@Override
	public void D1()
	{
		System.out.println("I am good is overide from S1 class");
	}

}

abstract class Geeks {
    abstract void turnOn();
    abstract void turnOff();
}

// Concrete class implementing the abstract methods

class TVRemote extends Geeks {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}
public class Abstract {

	public static void main(String[] args) {
		
		S2 obj=new S2();
		obj.D1();
		obj.D2();
		
		TVRemote P=new TVRemote();
		P.turnOn();
		P.turnOff();
	}

}
