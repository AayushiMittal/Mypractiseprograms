package PractisePrograms;

public class Classgrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int Array[] = new int[] { 35, 55, 68, 75, 90, 95, 69, 71, 74 };

		for (i = 0; i < 9; i++) {

			if (Array[i] < 40) {

				System.out.println("Your mark is " + Array[i] + " and grade is F");

			} else if (Array[i] < 50) {

				System.out.println("Your mark is " + Array[i] + " and grade is E");

			} else if (Array[i] < 60) {

				System.out.println("Your mark is " + Array[i] + " and grade is D");

			} else if (Array[i] < 70) {

				System.out.println("Your mark is " + Array[i] + " and grade is C");

			} else if (Array[i] < 80) {

				System.out.println("Your mark is " + Array[i] + " and grade is B");

			} else if (Array[i] < 90) {

				System.out.println("Your mark is " + Array[i] + " and grade is B+");

			} else if (Array[i] < 95) {

				System.out.println("Your mark is " + Array[i] + " and grade is A");

			} else if (Array[i] < 100) {

				System.out.println("Your mark is " + Array[i] + " and grade is A+");

			} else {
				System.out.println("null");

			}
		}
	}
}