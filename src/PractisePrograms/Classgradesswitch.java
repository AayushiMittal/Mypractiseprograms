package PractisePrograms;

public class Classgradesswitch

{

	public static void main(String[] args)

	{
		// TODO Auto-generated method stub

		//int i;
		char grading = 'D';

		int Array[] = new int[] { 35, 55, 68, 75, 90, 95, 69, 71, 74 };

		//for (i = 0; i < 9; i++)
		{
			
			switch (grading)

			{
			
			case 'A':

				System.out.println("Your marks are between 90 - 100");

				break;

			case 'B':

				System.out.println("Your marks are between 80 - 90");

				break;

			case 'C':

				System.out.println("Your marks are between 70 - 80");

				break;

			case 'D':

				System.out.println("Your marks are between 60 - 70");

				break;

			case 'E':

				System.out.println("Your marks are between 50 - 60");

				break;

			case 'F':

				System.out.println("Your marks are between 40 - 50");

				break;

			default:
				System.out.println("Enter the correct Grade");

			}
		}

	}

}
