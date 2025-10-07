package Actions;

public class UseWhile {

	public static void main(String[] args) {
		
		int incr=1,sum=0;
		
		while(incr<=10)
		{
			sum=sum+incr;
			incr=incr+1;
			
		}
		
		System.out.println("First 10 of natural numbers sum is :" + sum);
	}
	
}
