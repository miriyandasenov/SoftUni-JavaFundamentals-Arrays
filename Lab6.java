import java.util.Scanner;

public class Lab6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String[] arr1 = sc.nextLine().split(" ");

		String[] arr2 = sc.nextLine().split(" ");

		int n = arr1.length;

		int sum = 0;

		int loops = 0;

		for(int i = 0; i < n; i++){

			int n1 = Integer.parseInt(arr1[i]);
			int n2 = Integer.parseInt(arr2[i]);

			if (n1 == n2){
				sum += n1;
				loops++;
			} else {
				System.out.println("Arrays are not identical. Found difference at " + i + " index.");
				break;
			}
		}

		if( loops == n ) System.out.println("Arrays are identical. Sum: " + sum);

	}
}
 