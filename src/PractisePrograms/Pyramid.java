package PractisePrograms;

public class Pyramid 
{
				 					
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
  int i;
  int j;
  int k;
  
  
	/*for (i=1; i<=6; i++)
	{
		for(j=1; j<=(i+1)/2; j++)
		{
			System.out.print(j);
	
		}
		
		for(k=i/2; k>=1; k--)
		{
			System.out.print(k);
		
		}
		System.out.println(" ");
	} */
	
  for(i=1; i<=6; i++)
  {
	for(j=1; j<=(i+1)/2; j++)
	{
		System.out.print(j);
	}
	for(k=i/2; k>=1; k--)
	{
		System.out.print(k);
	}
	System.out.println(" ");
	}

}
}
