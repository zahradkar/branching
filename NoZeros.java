public class NoZeros {
    public static void main(String[] args) {
        System.out.println(numbers(1450));
        System.out.println(numbers(960000));
        System.out.println(numbers(1050));
        System.out.println(numbers(-1050));
    }

    private static int numbers(int input) {
        if (input == 0)
            return input;

        while (input % 10 == 0)
            input /= 10;
        return input;
    }
}