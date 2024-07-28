package Questions;

import java.util.Scanner;

public class GalaticArthematicQ1 {
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      long num1=sc.nextLong();
      long num2=sc.nextLong();
      long result=galaticAddition(num1, num2);
      System.out.println(result);
		
	}
	//This method is accepting two parameters,when we call that we have pass to pass the parameter
	//for that input should be ready ,hence we have to take the input from main method
	
	public static long galaticAddition(long num1,long num2)
	{
		return num1+num2;
	}
	

}
