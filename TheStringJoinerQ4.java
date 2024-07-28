package Questions;

import java.util.Scanner;

public class TheStringJoinerQ4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//System.out.println("enter 2 strings");
		String str1=scan.next();
		String str2=scan.next();
		System.out.println(joinString(str1,str2));
		//String result=joinString(str1, str2);
		//System.out.println(result);
		
	}
	
	public static String joinString(String str1,String str2)
	{
		return str1+str2;  //concatenating
	}

}
