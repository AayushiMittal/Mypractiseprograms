package PractisePrograms;

public class ReversePattern
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     int i;
     int j;
     int k;
     
     for(i=4; i>0 ;i--)
     {
    	 for(j=1; j<i; j++)
    	 {
    		 System.out.print(" ");	 
    	 }
    	 
    	 for(k=4;k>=i; k--)
    	 {
    		 System.out.print("*");	 
    	 }
     System.out.println("");
     }
     
     
     
	}

}
