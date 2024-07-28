package Questions;

import java.util.Scanner;

public class Calculator {
	Scanner scan=new Scanner(System.in);
	void Addition()
	{
		System.out.println("enter two numbers for addition");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Addition of "+ a + " and "+ b + " is "+ (a+b));
	}
	void Subtraction()
	{
		System.out.println("enter two numbers for subtraction");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Subtraction of "+ a + " and "+ b + " is "+ (a-b) );
	}
	void Multiplication()
	{
		System.out.println("enter two numbers for multiplication");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Multiplication of "+ a + " and "+ b + " is "+ (a*b));
	}
	void Division()
	{
		System.out.println("enter two numbers for division");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Division of "+ a + " and "+ b + " is "+ (a/b) );
	}
	void FindRemainder()
	{
		System.out.println("enter two numbers for Finding Remainder");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Remainder of "+ a + " and " + b + " is "+ (a%b) );
	}
	void Square()
	{
		System.out.println("enter a number for square");
		int a=scan.nextInt();
		System.out.println("Square of "+ a + " is "+ (a*a) );
	}

}
