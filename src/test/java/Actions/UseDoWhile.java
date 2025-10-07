package Actions;

import java.util.Scanner;

public class UseDoWhile {

	public static void main(String[] args) {
		String uid,psswd;
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("Enter user Name:");
			uid=sc.next();
			System.out.println("Enter passwor:");
			psswd=sc.next();
			
		}while(!uid.equals("Ravi") || !psswd.equals("Babu"));

	}

}
