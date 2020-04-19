import java.util.Scanner;

public class Lab5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		String[] arrInput = input.split(" ");

		int n = arrInput.length;

		int[] arrNumbers = new int[n];

		int evenSum = 0;

		int oddSum = 0;

		for(int i = 0; i < n; i++){
			arrNumbers[i] = Integer.parseInt(arrInput[i]);

			if(arrNumbers[i] % 2 == 0){
				evenSum += arrNumbers[i];
			}else{
				oddSum += arrNumbers[i];
			}
		}

		System.out.println(evenSum - oddSum);
	}
}