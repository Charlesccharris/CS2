import java.lang.*;
import java.util.Scanner;

class Assignment1{
	public static void main(String[] args){
/*	Create an array of 100 randomly chosen integers

	Prompts the use to enter the index of the array, then
	displays the corresponding element value.
	If the specified index is out of bounds, display
	the message Out of Bounds.
*/
		Scanner input = new Scanner(System.in);
		int[] array = new int[100];
		int index = 0;

		for(int x = 0; x < 100; x++){
			array[x] = (int)(Math.random()*1000);
		}

		System.out.print("Enter index: ");
		index = input.nextInt();
		getIndex(index, array);
	}

	public static void getIndex(int index, int[] array){
		try{
			System.out.println(array[index]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds");
		}
	}
}
