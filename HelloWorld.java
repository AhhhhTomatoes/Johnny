import java.util.Scanner;
import java.lang.Math;
class HelloWorld
{
	public static void main(String[]args)
	{
		nameReader();
		ageDecider();
		calculator();
		recalculate();
	}
		
	static void destroyer()
	{
		System.out.println();
		System.out.println("IMPOSTER!!! BEGONE AND NEVER COME BACK");
		System.exit(1);
	}
	static void calculator()
	{
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		double num4 = 0;
		double num5 = 0;
		double num6 = 0;
		int i = 0;
		int n = 10;
		String operation;
		String numOfCalc;
		boolean x = true;
		
		Scanner input = new Scanner(System.in);
		
		Scanner input2 = new Scanner(System.in);
		
		System.out.println();
		System.out.print("How many numbers are you calculating? (Min. 2, Max. 5): ");
		numOfCalc = input2.next();
		
		
		Scanner op = new Scanner(System.in);
		
		
		
		
		if (numOfCalc.equals("2"))
		{
			System.out.print("Enter first number: ");
			num1 = input.nextDouble();
			System.out.print("Enter second number: ");
			num2 = input.nextDouble();
			System.out.print("Enter operation: ");
			operation = op.next();
					
			if (operation.equals("+"))
			{
				System.out.println(num1 + num2);
			}
			else if (operation.equals("-"))
			{
				System.out.println(num1 - num2);
			}
			else if (operation.equals("*"))
			{
				System.out.println(num1 * num2);
			}
			else if (operation.equals("/"))
			{
				System.out.println(num1 / num2);
			}
			else if (operation.equals("^"))
			{
				System.out.println(Math.pow(num1, num2));
			}
			else
			{
				System.out.println("Invalid operation");
			}
			}
		else if (numOfCalc.equals("3"))
		{
			System.out.print("Enter first number: ");
			num1 = input.nextDouble();
			System.out.print("Enter second number: ");
			num2 = input.nextDouble();
			System.out.print("Enter third number: ");
			num3 = input.nextDouble();
			System.out.print("Enter operation: ");
			operation = op.next();
			
			if (operation.equals("+"))
			{
				System.out.println(num1 + num2 + num3);
			}
			else if (operation.equals("-"))
			{
				System.out.println(num1 - num2 - num3);
			}
			else if (operation.equals("*"))
			{
				System.out.println(num1 * num2 * num3);
			}
			else if (operation.equals("/"))
			{
				System.out.println(num1 / num2 / num3);
			}
			else
			{
				System.out.println("Invalid operation");
			}
		}
		else if (numOfCalc.equals("4"))
		{
			System.out.print("Enter first number: ");
			num1 = input.nextDouble();
			System.out.print("Enter second number: ");
			num2 = input.nextDouble();
			System.out.print("Enter third number: ");
			num3 = input.nextDouble();
			System.out.print("Enter fourth number: ");
			num4 = input.nextDouble();
			System.out.print("Enter operation: ");
			operation = op.next();
			
			
			if (operation.equals("+"))
			{
				System.out.println(num1 + num2 + num3 + num4);
			}
			else if (operation.equals("-"))
			{
				System.out.println(num1 - num2 - num3 - num4);
			}
			else if (operation.equals("*"))
			{
				System.out.println(num1 * num2 * num3 * num4);
			}
			else if (operation.equals("/"))
			{
				System.out.println(num1 / num2 * num3 * num4);
			}

			else
			{
				System.out.println("Invalid operation");
			}
		}
		else if (numOfCalc.equals("5"))
		{
			System.out.print("Enter first number: ");
			num1 = input.nextDouble();
			System.out.print("Enter second number: ");
			num2 = input.nextDouble();
			System.out.print("Enter third number: ");
			num3 = input.nextDouble();
			System.out.print("Enter fourth number: ");
			num4 = input.nextDouble();
			System.out.print("Enter fifth number: ");
			num5 = input.nextDouble();
			System.out.print("Enter operation: ");
			operation = op.next();
			
			if (operation.equals("+"))
			{
				System.out.println(num1 + num2 + num3 + num4 + num5);
			}
			else if (operation.equals("-"))
			{
				System.out.println(num1 - num2 - num3 - num4 - num5);
			}
			else if (operation.equals("*"))
			{
				System.out.println(num1 * num2 * num3 * num4 * num5);
			}
			else if (operation.equals("/"))
			{
				System.out.println(num1 / num2 / num3 / num4 / num5);
			}
			else
			{
				System.out.println();
				System.out.println("Invalid operation");
			}
		}
		else 
		{
			System.out.println();
			System.out.println("YOU HAVE TYPED THE WRONG THING PREPARE TO DIE");
			Stabber();
			
		}
	}
	static void recalculate()
	{
		Scanner replay = new Scanner(System.in);
		System.out.println();
		System.out.print("Would you like to calculate again? ");
		String yesno = replay.next();
		
		if (yesno.equals("yes") || yesno.equals("Yes") || yesno.equals("Y") || yesno.equals("y"))
		{
			calculator();
		}
		else if (yesno.equals("no") || yesno.equals("No") || yesno.equals("N") || yesno.equals("n"))
		{
			System.out.println();
			System.out.println("Thank you for using my calculator, come back anytime!");
			System.exit(1);
		}
		else 
		{
			System.out.println();
			System.out.println("Invalid Answer try again");
			recalculate();
		}
	}
	static void ageDecider()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Type your age: ");
		int age = input.nextInt();
		int count = 0;
		
		while (age != 16)
		{
			System.out.println();
			System.out.print("Incorrect age try again: ");
			age = input.nextInt();
			count++;
			
			if (count == 2)
			{
				if (age == 16)
				{
					break;
				}
				System.out.println();
				System.out.println("You have failed. BEGONE!");
				System.exit(1);
			}
		}
		System.out.println();
		System.out.println("Correct you have entered the correct age after " + count + " trys!");
	}
	static void nameReader()
	{
		Scanner nameReader = new Scanner(System.in);
		System.out.print("Enter your name: "); 
		String name = nameReader.next();
		
		if (name.equals("Ryan") || name.equals("ryan"))
		{
			System.out.println();
			System.out.println("Hello Ryan, welcome to your personnal calculator!");
			System.out.println();
		}
		else
		{
			destroyer();
		}
	
	}
	static void Stabber()
	{
		int stabby = 0;
		while (stabby != 10)
		{
			System.out.println("STAB");
			stabby++;
		}
	}
}




