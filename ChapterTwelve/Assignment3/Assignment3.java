import java.util.*;
import java.io.*;

class Assignment3{
	public static void main(String[] args){
/*		(Baby name popularity ranking)
		The popularity ranking of baby names from years 2001 to 2010 is downloaded from
		www.ssa.gov/oact/babynames and stored in files named
		babynameranking2001.txt, babynameranking2002.txt, ...,
		babynameranking2010.txt.

		Each file contains one thousand lines. Each line contains a ranking, a boy's name,
		number for the boy's name, a girl's name, and number for the girl's name.

		Write a program that prompts the user to enter the year, gender, and followed by a name,
		and displays the ranking of the name for the year.
*/
		String ranking = "";
		String boyName = "";
		String girlName = "";
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: ");
		String year = input.nextLine();

		System.out.print("Enter gender: ");
		String gender = input.nextLine();

		System.out.print("Enter name: ");
		String name = input.nextLine();

		input.close();

		File file = new File("babynameranking" + year + ".txt");

		try{
			Scanner output = new Scanner(file);

			while(output.hasNext()){
				ranking = output.next();
				boyName = output.next();
				girlName = output.next();
				if(boyName.equals(name) || girlName.equals(name)){
					System.out.println(name + " is ranked #" + ranking + " in year " + year);
					output.close();
					System.exit(0);
				}
			}
			output.close();
		}
		catch(FileNotFoundException ex){
			System.out.println("No such file");
			System.exit(0);
		}
		System.out.println("The name " + name + " is not ranked in the year " + year);
	}
}

