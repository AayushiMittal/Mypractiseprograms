package PractisePrograms;

public class NumberPatternoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int i;
 int j;
 int k;
 int n=1;
 
 /*
 for(i=1; i<5 ; i++)
 {
	 for(j=1; j<=i; j++)
	 {
		 
		 System.out.print(" " + k);
		 k=k+1;
 }
         System.out.println(" ");
	}
*/
 
 for(i=1; i<5; i++)
   {
	 for(j=4; j>i ; j--)
	 {
		 
		 System.out.print("#");
    }
	 for(k=1; k<=i; k++)
	 {
		 
		 System.out.print(n);
		 n=n+1;
 }
 System.out.println(" ");
   }
 
}
}