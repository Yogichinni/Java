package Questions;

import java.util.Scanner;

public class CubePower {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=scan.nextInt();
		System.out.println(cubeNumber(num));
	}
	
	public static int cubeNumber(int num)
	{
		return num*num*num;
	}

}
