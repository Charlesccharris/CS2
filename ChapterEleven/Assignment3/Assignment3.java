import java.util.Scanner;
import java.util.ArrayList;

class Assignment3{
	public static void main(String[] args){
/*		Write a method that removes
		the duplicate elements from an array list of integers.

		Under Programming Exercises 11.13,
		follow the direction found on page 449 of your text book.
*/
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		System.out.print("Please enter 10 integers: ");
		for(int i = 0; i < 10; i++){
			list.add(input.nextInt());
		}
		removeDuplicate(list);
		System.out.println("");
	}

	public static void removeDuplicate(ArrayList<Integer> list){

		ArrayList<Integer> newList = new ArrayList<>();
		int index = 0;
		int checkingNumber = 0;
                while(!list.isEmpty()){
			index = 0;
			checkingNumber = list.get(index);
			if(!newList.contains(checkingNumber)){
				newList.add(checkingNumber);
             		}
               		list.remove(index);
		}

		System.out.print("The distinct integers are: ");

		for(int x = 0; x < newList.size(); x++){
			System.out.print(newList.get(x) + " ");
		}
	}
}
