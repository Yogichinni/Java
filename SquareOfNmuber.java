package Programs;

import java.util.Scanner;

public class SquareOfNmuber {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to find square");
		int num=scan.nextInt();
		int res=num*num;
	 	System.out.println("Result is:"+res);
	 	scan.close();
	}

}
