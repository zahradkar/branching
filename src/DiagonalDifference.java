public class DiagonalDifference {
    public static void main(String[] args) {
        int[][] a = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {9, 8, 9}
        };
		
		int[][] b = new int[][]{
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}
        };

        System.out.println(diagonalDifference(a));
		System.out.println(diagonalDifference(b));
    }

    private static int diagonalDifference(int[][] input) {
        int x = 0;
        int y = 0;
        for (int row = 0; row < input.length; row++)
            for (int col = 0; col < input[0].length; col++) {
                if (row == col)
                    x += input[row][col];
                if (row == input[0].length - 1 - col)
					y += input[row][col];
            }
			

        return Math.abs(x-y);
    }
}