package Actions;

import java.util.Scanner;

public class NestedElse {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Salary :");
		int sal=sc.nextInt();
		char grade;
		if(sal<10000)
			grade='C';
		else if(sal>=10000 && sal<=50000)
			grade='B';
		else
			grade='A';
		
				System.out.println("Grade for salary :" + grade);
			
	}

}
