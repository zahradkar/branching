import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chessboard {
    public static void main(String[] args) {
//        int[][] board = {
//                {0, 1, 2, 3, 4},
//                {5, 6, 7},
//                {},
//                {32, 54}
//        };
//
//        System.err.println("board.length: " + board.length);
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++)
//                System.out.print(board[i][j] + ",");
//            System.out.println();
//        }
//
//        System.out.println("----------------------------");
//
//        for (int[] ints : board) {
//            for (int anInt : ints) System.out.print(anInt + ",");
//            System.out.println();
//        }

//        board.forEach()
//        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        Iterable<int[]> iterableArray = Arrays.asList(array);
//        iterableArray.forEach(System.out::println);

        int[] array = {10, 2, 5, 8, 1};

// Sort the array
        Arrays.sort(array);

// Print the sorted array
        for (int number : array) {
            System.out.println(number);
        }


//        printChessBoard(null);
//        print(board);
//        test();
//
//
//        List<Integer> zoznam = Arrays.asList(2, 1, 4, 1, 1);
//        zoznam.sort(Integer::compareTo);
//
//        for (Integer cislo : zoznam) {
//            System.out.println(cislo);
//        }
    }

    private static void printChessBoard(int[][] input) {

    }

    private static void print(int[][] input) {
        System.out.println("input.length: " + input.length);
        System.out.println("input[0].length: " + input[0].length);
        System.out.println("input[1].length: " + input[1].length);
//        for (int i = 0; i < input.length; i++)
//            System.out.println("laskdjf");
    }

    private static void test() {
        List<String> list = new ArrayList<>();

        System.out.println("list.size(): " + list.size());
    }
}
