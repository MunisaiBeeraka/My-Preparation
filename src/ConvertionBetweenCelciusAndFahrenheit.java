import java.util.Scanner;

public class ConvertionBetweenCelciusAndFahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 - to convert to Calcius to Fahrenheit");
		System.out.println("Press 2 -- to convert to Fahrenheit to Celcius");
		int choice = sc.nextInt();

		if (choice == 1)
		{
			System.out.println("Enter Celcius value");
			double celcius = sc.nextInt();
			double fahrenheit = ((celcius * 9.0/5) + 32);
			System.out.println("Fahrenheit Value: " + fahrenheit);

		}else if (choice == 2){
			System.out.println("Enter Fahrenheit value");
			double fahrenheit1 = sc.nextInt();
			double	 celcius2 = (fahrenheit1 - 32) * 5.0/9;
			System.out.println("Celcius Value: " + celcius2);

		} else {
			System.out.println("Check your entered number!!");
		}

	}

}
