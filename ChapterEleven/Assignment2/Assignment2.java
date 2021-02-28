import java.util.Scanner;
import java.util.ArrayList;

class Assignment2{
	public static void main(String[] args){
/*		Write a program that randomly
		fills in 0s and 1s into an n-by-n matrix.

		Under Programming Exercises 11.9,
		follow the direction found on page 449 of your text book.
*/
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array size (n): ");
		int n = input.nextInt();

		int[][] newMatrix = new int[n][n];

		double determine = 0;
		int newRow = 0;
		int row = 0;
		int column = 0;

		ArrayList<Integer> rows = new ArrayList<>();
		ArrayList<Integer> columns = new ArrayList<>();

		for(int x = 0; x < n; x++){
			newRow = 0;
			for(int y = 0; y < n; y++){
				determine = Math.random()*10;
				if(determine > 5){
					newMatrix[x][y] = 0;
				}
				else{
					newMatrix[x][y] = 1;
					newRow += 1;
				}
			}
			rows.add(newRow);
			if(newRow > row){
				row = newRow;
			}
		}

		column = findMaxColumn(newMatrix, n, columns);
		printArray(newMatrix, n, row, column, rows, columns);

	}

	public static int findMaxColumn(int[][] matrix, int n, ArrayList columns){
		int column = 0;
		int newColumn = 0;
		for(int y = 0; y < n; y++){
			newColumn = 0;
			for(int x = 0; x < n; x++){
				if(matrix[x][y] == 1){
					newColumn += 1;
				}
			}
			columns.add(newColumn);
			if(newColumn > column){
				column = newColumn;
			}
		}
		return column;
	}

	public static void printArray(int[][] newMatrix, int n, int row, int column,
					ArrayList rows, ArrayList columns){
		ArrayList<Integer> maxRows = new ArrayList<>();
		ArrayList<Integer> maxColumns = new ArrayList<>();
		int index = 0;

		for(int x = 0; x < n; x++){
			for(int y = 0; y < n; y++){
				System.out.print(newMatrix[x][y]);
			}
			System.out.println("");
		}

		while(rows.contains(row)){
			index = 0;
			index = rows.indexOf(row);
			maxRows.add(index);
			rows.remove(index);
			rows.add(index, 0);
		}

		while(columns.contains(column)){
			index = 0;
			index = columns.indexOf(column);
			columns.remove(index);
			columns.add(index, 0);
			maxColumns.add(index);
		}

		System.out.println("The largest row index: " + maxRows.toString());
		System.out.println("The largest column index: " + maxColumns.toString());
	}
}
