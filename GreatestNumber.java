package Programs;

import java.util.Scanner;

public class GreatestNumber {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1=scan.nextInt();
		
		System.out.println("Enter 2nd number");
		int num2=scan.nextInt();
		
		System.out.println("Enter 3rd number");
		int num3=scan.nextInt();

		if(num3>num1 && num3>num2)
		{
			System.out.println(num3+" greatest");
		}
		else if(num1>num2 && num1>num3)
		{
			System.out.println(num1+" greatest");
		}
		else {
			System.out.println(num2+" greatest");
		}
	}
}
