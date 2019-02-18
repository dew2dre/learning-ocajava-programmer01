package week05practical;

class TicTacToe{

	public static void main(String...args){
		String[][] tictactoeTable1 = new String[][]{
					{"X","X","O"},
					{"O","O","O"},
					{"O","X","O"}};
		String[][] tictactoeTable2 = new String[][]{
					{"X","X","X"},
					{"O","O","X"},
					{"X","X","O"}};
		System.out.println("	Tic Tac Toe");		
		//Horizontal test
		displayTable(tictactoeTable1);
		System.out.println("Horizontal check winner X: " + checkHorizontalLines(tictactoeTable1,"X"));
		System.out.println("Horizontal check winner O: " + checkHorizontalLines(tictactoeTable1,"O"));
         
		displayTable(tictactoeTable2);
		System.out.println("Horizontal check winner X: " + checkHorizontalLines(tictactoeTable2,"X"));
		System.out.println("Horizontal check winner O: " + checkHorizontalLines(tictactoeTable2,"O"));
		//Vertical test
        String[][] tictactoeTable3 = new String[][]{
					{"X","O","X"},
					{"X","O","X"},
					{"X","X","O"}};
		
		
		displayTable(tictactoeTable3);
		System.out.println("Vertical check winner X: " + checkVerticalLines(tictactoeTable3,"X"));
		System.out.println("Vertical check winner O: " + checkVerticalLines(tictactoeTable3,"O"));

		
		//Diagonal test
		String[][] tictactoeTable4 = new String[][]{
					{"O","O","X"},
					{"O","O","X"},
					{"X","X","O"}};
		displayTable(tictactoeTable4);
		System.out.println("Diagonal check winner X: " + checkDiagonalLines(tictactoeTable4,"X"));
		System.out.println("Diagonal check winner O: " + checkDiagonalLines(tictactoeTable4,"O"));
		
		System.out.println("\n\t4 x 4 arrays");
		String[][] tictactoeTable5 = new String[][]{
					{"O","O","O","X"},
					{"O","O","X","X"},
					{"X","X","O","O"},
					{"X","X","O","X"}};
		displayTable(tictactoeTable5);
		System.out.println("Horizontal check winner X: " + checkHorizontalLines(tictactoeTable5,"X"));
		System.out.println("Horizontal check winner O: " + checkHorizontalLines(tictactoeTable5,"O"));
		System.out.println("Vertical check winner X: " + checkVerticalLines(tictactoeTable5,"X"));
		System.out.println("Vertical check winner O: " + checkVerticalLines(tictactoeTable5,"O"));
		System.out.println("Diagonal check winner X: " + checkDiagonalLines(tictactoeTable5,"X"));
		System.out.println("Diagonal check winner O: " + checkDiagonalLines(tictactoeTable5,"O"));
	
	
		
	}
	
	static boolean checkHorizontalLines(String [][] arr, String target){
	
		int matchCount = 0;
		for(String[] row: arr){
			matchCount = 0;
			for(String cell: row){
				if(cell.equals(target)){
					matchCount++;
					if(matchCount == row.length)
						return true;
				}
			}
		}
	   return false;
	}
	
	static boolean checkVerticalLines(String [][] arr, String target){
		int matchCount;
		for(int outer = 0; outer < arr[0].length; outer++){
			matchCount = 0;
			for (int inner = 0; inner < arr.length; inner++) {
				if(arr[inner][outer].equals(target)){
					matchCount++;
					if(matchCount == arr.length)
						return true;
				}
			}
		}
		return false;
	}
	
	static boolean checkDiagonalLines(String [][] arr, String target){
		/* diagonals have 2 components each with a special properties
		// One side the co-ordinates are the same values like (0,0)(1,1) & (2,2)
		//The other one is decreasing row and increasing column
		//like so (2,0)(1,1) & (0,2). It also begin from opposite ends 
		*/
		int matchCountD1 = 0;
		for(int outer = 0; outer < arr[0].length; outer++){
			if(arr[outer][outer].equals(target)){
				++matchCountD1;
				if(matchCountD1 == arr[0].length)
					return true;
			}
		}
		
		int matchCountD2 = 0;
		
		for(int row = arr[0].length-1,column = 0; 0 <= row;
					row--,column++){
			
			if(arr[row][column].equals(target)){
				//System.out.println("check winning co-ordinates row:" + row + " column:" + column);
				++matchCountD2;
				if(matchCountD2 == arr[0].length)
					return true;
			}
		}
		return false;
		
	}
	static void displayTable(String [][] table){
		for(String[] row: table){
			System.out.println("	");
			for( String cell: row){
			  System.out.print("	"+ cell);
			}
		}
		System.out.println(" ");
	}
	
	
}