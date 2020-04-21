import java.util.Scanner;

public class Lab7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String[] inpStr = sc.nextLine().split(" ");

		int n = inpStr.length;

		int[] inpNum = new int[n];

		for(int i = 0; i < n; i++){

			inpNum[i] = Integer.parseInt(inpStr[i]);
		}

		while(n > 1){

			for(int i = 0; i < n-1; i++){

				inpNum[i] = inpNum[i] + inpNum[i + 1];
			}

			n--;
		}
		System.out.println(inpNum[0]);
	}
}






