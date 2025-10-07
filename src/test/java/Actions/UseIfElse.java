package Actions;

import java.util.Scanner;

public class UseIfElse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Salary :");
		int sal=sc.nextInt();
		int asal;
		if(sal>=30000)
		{
			asal=12*sal;
			System.out.println("Annual Salary is :" +asal);
		}
		else
		{
			System.out.println("Salsry mst b more than 30000 toget annual salary... ");
		}

			int num=20;
			
			if(num%2==0)
			{
				System.out.println("Even numbers");
			}
			else
			{
				System.out.println("Odd");
			}
	}

}
