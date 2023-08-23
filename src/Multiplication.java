public class Multiplication {
    public static void main(String[] args) {

        int[][] skuska = multi(4);
        for (int i = 0; i < skuska.length; i++) {
            for (int j = 0; j < skuska[0].length; j++)
                System.out.print(skuska[i][j] + " ");
            System.out.println();
        }

    }

    private static int[][] multi(int size) {
        int[][] result = new int[size][size];
        for (int row = 0; row < size; row++)
            for (int col = 0; col < size; col++)
                result[row][col] = (row + 1) * (col + 1);
        return result;
    }
}