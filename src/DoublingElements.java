public class DoublingElements{
	public static void main(String[] args){
		int[][] a = new int[][]{
			{1, 1, 2,3,4},
			{3, 1, 2,3,4},
			{1, 1, 2,3,42},
			{18, 1, 2,3,26},
			{98, 4, 2,3,4}
		};
		
		int[][] vysledok = nieco(a);
		
		for (int row=0; row<vysledok.length; row++){
			for (int col=0; col<vysledok[row].length; col++)
				System.out.print(vysledok[row][col] + ",");
			System.out.println();
		}
		
	}
	
	private static int[][] nieco(int[][] input){
		for (int row=0; row<input.length; row++)
			for (int col=0; col<input[row].length; col++)
				if (row%2!=0)
					if (input[row][col]%2==0)
						input[row][col] *= 2;
		return input;
	}
}