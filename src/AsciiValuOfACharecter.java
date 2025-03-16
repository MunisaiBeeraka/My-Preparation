import java.util.Scanner;

public class AsciiValuOfACharecter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter charecter values to find ascii value");
		char ch = sc.next().charAt(0);
		int asci = (int)ch;
		System.out.println("Ascii value of the charecter " + ch + " is " + asci);

	}

}
