import java.util.Scanner;

public class PositveAndNegaticeChecking {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		if (number >= 0)
		{
			System.out.println(number + " is Positive Number.");
		} else if (number == 0)
		{
			System.out.println("Number is zero");
		} else {
			System.out.println(number + " is a Negative Number.");
		}

	}

}
