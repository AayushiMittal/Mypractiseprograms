package PractisePrograms;

public class Calci 
{

	public void calci(int c, int a, int b) 
	{

		int calculation;
		calculation = c;
		int temp = 0;
		String message = null;

		switch (calculation) 
		{

		case 1:
			message = "The addition of the number is = " + (a+b);
			break;

		case 2:
			
			if (a>b){
				message = "Then Subtraction of the number is = " + (a-b);
			}
			else{
				
				message = "The multiplication of the number is = " + (b-a);
			}
			break;

		case 3: 
			message = "The multiplication of the number is = " + (a*b);
			break;

		case 4:
			if (b==0){
				message = "Enter other number apart from 0";
				
			} 
			else
			{
				message = "The division for the number is = "+( a / b);	
			}
		
			break;

		default:
			message = "The division for the number is = "+( a % b);	
		
			break;

		}
	
		System.out.println(message);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calci obj = new Calci();

		obj.calci(4,4,4);
	}

}
