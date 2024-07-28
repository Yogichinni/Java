package Questions;

import java.util.Scanner;

public class DoubleTheNumberQ3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
	    int res=doubleTheNumber(num); //System.out.println(doubleTheNumber(num));
		System.out.println(res);
		
	}
	
	public static int doubleTheNumber(int num)
	{
		return num*2;
	}

}
