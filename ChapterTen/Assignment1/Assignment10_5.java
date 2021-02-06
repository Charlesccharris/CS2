import java.util.Scanner;
import java.util.Arrays;

class Assignment10_5{
	public static void main(String[] args){
/*		(Displaying the prime factors)
		Write a program that prompts the user to enter a
		positive integer and displays all its smallest
		factors in decreasing order.

		For example;
		If the integer is 120
		the smallest factors are displayed as 5, 3, 2, 2, 2
		Use the StackOfIntegers class to store the factors
		and retrieve and display them in reverse order
*/

		int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
		Scanner input = new Scanner(System.in);
		StackOfIntegers listOfPrimes = new StackOfIntegers();
		int number = 1;
		int newNumber = 0;
		int size = 1;

		System.out.print("Please input your whole number: ");
		number = input.nextInt();

		while(number != 1){
			newNumber = number;
			System.out.println(number);
			for(int index = 0; index < prime.length; index++){
				if((number % prime[index]) == 0){
					listOfPrimes.push(prime[index]);
					number /= prime[index];
					index = 0;
				}
			}
			if(newNumber == number){
				System.out.println("Sorry, the next prime for your number can't be found, try a different one number.");
				System.exit(1);
			}
		}

		size = listOfPrimes.getSize();
		int[] numbers = new int[size];

		while(!listOfPrimes.empty()){
			for(int i = 0; i < size; i++){
				numbers[i] = listOfPrimes.pop();
			}
		}
		Arrays.sort(numbers);

		System.out.print("We found the following prime numbers: ");
		for(int i = size - 1; i > -1; i--){
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}
}
