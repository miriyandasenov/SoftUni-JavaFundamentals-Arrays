import java.util.Scanner;

public class Lab3
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		String[] arrInput = input.split(" ");

		int sum = 0;

		for(int i = 0; i < arrInput.length; i++){

			int num = Integer.parseInt(arrInput[i]);

			if(num%2 == 0) sum += num;
		}

		System.out.println(sum);
	}
}








