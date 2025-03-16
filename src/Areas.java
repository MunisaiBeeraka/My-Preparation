import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter length and width of the rectangle");
		int length = sc.nextInt();
		int width = sc.nextInt();
		int area = length * width;
		System.out.println("Area of the rectangle is " + area);

	}

}
