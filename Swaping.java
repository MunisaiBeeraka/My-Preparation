import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Original numbers");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		
		swapping(a,b);

	}
	public static void swapping(int a, int b)
	{
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Swapped Numbers");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}

}
