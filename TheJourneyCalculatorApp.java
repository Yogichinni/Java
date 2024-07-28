package Questions;

import java.util.Scanner;

public class TheJourneyCalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		JourneyCalculator journeyCalculator=new JourneyCalculator();
		System.out.println("enter speed and time as real numbers");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		System.out.printf("%.2f\n",journeyCalculator.calculateDistance(speed,time));
		
		
		//System.out.printf("%.2f\n",journeyCalculator.calculateDistance(60.0,1.5));//double
		                          //or
        //System.out.println(journeyCalculator.calculateDistance(60.0,1.5));
		
		//double result=journeyCalculator.calculateDistance(60.0,1.5);
		//System.out.printf("%.2f",result);
	}

}
