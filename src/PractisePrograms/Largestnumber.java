package PractisePrograms;

/*to find the largest and smallest number in the array..*/

class Largestnumber {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		
		/*int numbers[];
		numbers = new int[] {2,6,7,8,1,3,5,56,87,54};
		int i;
		int sum, mult,div,remind,large,small,temp;
		
		sum = numbers[3] + numbers[6];
		mult= numbers[3] * numbers[6];
		div= numbers[3] / numbers[6];
		remind= numbers[3] % numbers[6];
		
		
		System.out.println("The number is " + sum );
		System.out.println("The number is " +mult);
		System.out.println("The number is " +div);
		System.out.println("the number is" +remind);
		
		if(numbers[3]<numbers[6]){
			
			large= numbers[6];
			small= numbers[3];
		}
		else{
			
			large= numbers[3];
			small= numbers[6];
		
		}
		System.out.println(large);
		
		if(numbers[0]>numbers[5]){
			temp= numbers[0] + numbers[5];
			}
		else{
			temp= numbers[0] * numbers[5];
			
		}
		System.out.println(temp);   */
		
		 int numbers[];
		 int i;
         int sum =0;
         int mult= 1;
         int largest=0;
         int smallest;
         
		numbers= new int[] {2,3,4,5,6,7,8,9,10,11};
		smallest= numbers[0];
		//for (        //define, //condition, //Iteration)
		
		for (i = 0 ; i<10 ;i++)
		{
		
			if(largest < numbers[i])
			{
				largest= numbers[i];
			}
			
		if(smallest > numbers[i]){
			
		smallest= numbers[i];
		}
			
			
			/*sum= sum + numbers[i];
		    mult= mult * numbers[i];*/
          System.out.println("the arraynumber [" + i + "] value is " + numbers[i]);
		}
		
		System.out.println("smallest" + smallest);
		
		System.out.println(largest);
		/*System.out.println("The sum is " + sum);
		System.out.println("The multiplication is " + mult);
 */
		
		

	}
}
