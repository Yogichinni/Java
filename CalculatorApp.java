package Questions;

import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	Calculator calculator=new Calculator();  // instance method is called by creating the object
	System.out.println("Hello User Welcome To KodnestCalculator....");
	
	while(true)
	{
	System.out.println("+ ======> Addition");
	System.out.println("- ======> Subtraction");
	System.out.println("* ======> Multiplication");
	System.out.println("/ ======> Division");
	System.out.println("% ======> Findremainder");
	System.out.println("^ ======> Findsquare");
	System.out.println("! ======> Stop");
	System.out.println(" Enter your choice");
	char ch=scan.next().charAt(0);
	
	switch(ch)
	{
	case '+':calculator.Addition();
	break;
	
	case '-':calculator.Subtraction();
	break;
	
	case'*':calculator.Multiplication();
	break;
	
	case'/':calculator.Division();
	break;
	
	case'%':calculator.FindRemainder();
	break;
	
	case'^':calculator.Square();
	break;

	case'!':System.out.println("Ta taa bye bye see u later");
	return;
		
	default:System.out.println("enter your choice");
	}
	
	
	}

}
}