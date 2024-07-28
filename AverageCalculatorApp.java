package Questions;

import java.util.Scanner;

// call a method by using class name if at a method is static method and present in another class
public class AverageCalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter all eight sem marks");
		int sem1=scan.nextInt();
		int sem2=scan.nextInt();
		int sem3=scan.nextInt();
		int sem4=scan.nextInt();
		int sem5=scan.nextInt();
		int sem6=scan.nextInt();
		int sem7=scan.nextInt();
		int sem8=scan.nextInt();
		System.out.printf("%.2f",CalculateAverage.calculateAverage(sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8));
		scan.close();
	}

}
