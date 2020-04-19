import java.util.Scanner;

public class Lab4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		String[] arrInput = input.split(" ");

		int n = arrInput.length; 

		for(int i = 0; i < n / 2; i++){

			String temp1 = arrInput[i];
			String temp2 = arrInput[n - 1 - i];
			arrInput[i] = temp2;
			arrInput[n - 1 - i] = temp1; 
			 
		}

		for(int i = 0; i < n; i++){

			System.out.print(arrInput[i] + " ");
		}
	}
}