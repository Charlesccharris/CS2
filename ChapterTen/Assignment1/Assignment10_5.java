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

		int number = 120;
		StackOfIntegers listOfPrimes = new StackOfIntegers();
//		System.out.println("Please input your whole number: ");

		while(number != 1){
			System.out.println(number);
			if((number % 2) == 0){
				listOfPrimes.push(2);
				number /= 2;
			}
			else if((number % 3) == 0){
				listOfPrimes.push(3);
				number /= 3;
			}
			else if((number % 5) == 0){
				listOfPrimes.push(5);
				number /= 5;
			}
			else if((number % 7) == 0){
				listOfPrimes.push(7);
				number /= 7;
			}
			else if((number % 11) == 0){
				listOfPrimes.push(11);
				number /= 11;
			}
		}

//		listOfPrimes.push();

		while(!listOfPrimes.empty())
			System.out.print(listOfPrimes.pop() + " ");
	}
}
