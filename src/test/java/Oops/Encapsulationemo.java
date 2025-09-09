package Oops;

class Human{
	
	private int age;
	
	private String name;
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}

public class Encapsulationemo {

	public static void main(String[] args) {

		Human obj=new Human();
		obj.setName("Ravi");
		obj.setAge(5);
		
		System.out.println("Name:" + obj.getName()+   ","   + "Age:" + obj.getAge());
	
	}

}
