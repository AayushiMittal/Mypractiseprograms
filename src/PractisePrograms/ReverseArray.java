package PractisePrograms;

public class ReverseArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[];
		int i;
		
		numbers= new int[] {2,3,4,5,6,7,8,9,10,11};
		
		int a[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		int b[] = new int[] {10,9,8,7,6,5,4,3,2,1};
		int c[] = new int[10];
		
		for(i=0; i<10 ; i++){
			
			c[i] = a[i] + b[i];
			
			System.out.println("the array is" +c[i]);
		}
		
	}

}
