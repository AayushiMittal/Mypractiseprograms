package PractisePrograms;

public class Test 
{

	public static void main(String[] args)

	{
		// TODO Auto-generated method stub
		int i;
		int j;
		int k=10;

		for (i = 1; i < 5; i++) 
		{
			
			for (j =1; j <= i; j++)
			{
				System.out.print(" " +k);
				k=k-1;
			}
			
			System.out.println(" ");
		}
	}
}
