package Questions;

import java.util.Scanner;

public class TheTemperatureConverterApp {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	TemperatureConverter temperatureConverter=new TemperatureConverter();
	System.out.println("enter temp in F");
	double f=scan.nextDouble();
	System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(f));
}
}