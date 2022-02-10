import java.util.Scanner;
import java.lang.Math;
class arrayWork
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of dice: ");
		int numDice = input.nextInt();
		int x = 0;
		int i = 0;
		int l = 0;
		int k = 0;
		int m = 0;
		int n = 0;
		int b = 0;
		int Dice;
		int Dice2;
		int ans;
		
		for (x = 1; x <= numDice; x++)
		{
			Dice = (int)(Math.random() * 6 + 1);
			if (Dice == 1)
			{
				int[] num1 = new int[numDice];
				i++;
			}
			else if (Dice == 2)
			{
				int[] num2 = new int[numDice];
				l++;
			}
			else if (Dice == 3)
			{
				int[] num3 = new int[numDice];
				k++;
			}
			else if (Dice == 4)
			{
				int[] num4 = new int[numDice];
				m++;
			}
			else if (Dice == 5)
			{
				int[] num5 = new int[numDice];
				n++;
			}
			else if (Dice == 6)
			{
				int[] num6 = new int[numDice];
				b++;
			}
		
		}
		System.out.println("1 was rolled: " + i + " times!");
		System.out.println("2 was rolled: " + l + " times!");
		System.out.println("3 was rolled: " + k + " times!");
		System.out.println("4 was rolled: " + m + " times!");
		System.out.println("5 was rolled: " + n + " times!");
		System.out.println("6 was rolled: " + b + " times!");
		
	}
}
