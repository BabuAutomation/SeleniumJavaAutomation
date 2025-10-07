package Actions;

import java.util.Scanner;

public class UseBreak {

	public static void main(String[] args) {
		String uid,psswd;
		Scanner sc=new Scanner(System.in);
		int count=0;
		
		do
		{
			if(count==3)
			{
				System.out.println("Used more than 3 times and exiting application");
				break;
			}
			if(count>0)
			{
				System.out.println("Invalid credetials Try again");
			}
			
			System.out.println("Enter user Name:");
			uid=sc.next();
			System.out.println("Enter passwor:");
			psswd=sc.next();
			count=count+1;
		}while(!uid.equals("Ravi") || !psswd.equals("Babu"));

	}

}
