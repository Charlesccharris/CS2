import java.util.*;
import java.io.*;

class Exercise_12_31 {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the year, gender and name 
		System.out.print("Enter the year: ");
		String year = input.nextLine();

		System.out.print("Enter the gender: ");
		String gender = input.nextLine();

		System.out.print("Enter the name: ");
		String name = input.nextLine();

		// Create an ArrayList
		ArrayList<String> list = new ArrayList<>();

		// Read text from url
		try {
			java.net.URL url = new java.net.URL(
			"http://www.cs.armstrong.edu/liang/data/babynamesranking" +
			year + ".txt");

			// Create input file from url
			input = new Scanner(url.openStream());
			while (input.hasNext()) {
				for (int i = 0; i < 5; i++) {
					list.add(i, input.next());
				}

				// Display ranking for the name for the year
				if (list.get(gender(gender)).equals(name)) {
					System.out.println(
						name + " is ranked #" + list.get(0) + " in year " + year);
					System.exit(0);
				}
				list.clear();
			}
		}
		catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		}
		catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
		}

		System.out.println("The name " + name + " is not ranked in year " + year);
	}

	/** Returns the index for the corresponding gender */
	public static int gender(String gender) {
		if (gender.equals("M"))
			return 1;
		else
			return 3;
	}
}
