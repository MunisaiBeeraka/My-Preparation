import java.util.Scanner;

public class ChechingLeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = sc.nextInt();
		
		// Checking value in 4 digits and and year shouldn't be existing year
		if (year >= 1000)
		{
			if (year <= 2025)
			{
				checkLeapYear(year);
			} else {
				System.out.println("Given year is not an existing year.");
				System.exit(1);
			}
		} else {
			System.out.println("Year value should 1000 or above 1000.");
		}
		

	}

	public static void checkLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			System.out.println("Given year " + year + " is leap year.");
		} else {
			System.out.println("Year " + year + " is not an leap year.");
		}
		
	}

}
