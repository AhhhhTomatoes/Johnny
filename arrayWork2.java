import java.util.Scanner;
import java.lang.Math;
class arrayWork2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of dice: ");
		int numDice = input.nextInt();
		int x;
		int[] array = new int[7];
		
		for (x = 1; x <= numDice; x++)
		{
			int Dice = (int)(Math.random() * 6 + 1);
			if (Dice == 1)
			{
				array[1]++; 
			}
			if (Dice == 2)
			{
				array[2]++; 
			}
			if (Dice == 3)
			{
				array[3]++;
			}
			if (Dice == 4)
			{
				array[4]++; 
			}
			if (Dice == 5)
			{
				array[5]++; 
			}
			if (Dice == 6)
			{
				array[6]++; 
			}
		
		}
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println(array[5]);
		System.out.println(array[6]);
	}
}
