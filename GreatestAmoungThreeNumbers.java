import java.util.Scanner;

public class GreatestAmoungThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		System.out.println("Enter elements to enter in the array");
		for (int i = 0; i < arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int max_num = arr[0];
		for (int i = 0 ; i< arr.length  ; i++)
		{
			if (max_num < arr[i])
			{
				max_num = arr[i];
			}
		}
		System.out.println("The biggest number amoung three numbers is " + max_num);

	}

}
