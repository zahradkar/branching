public class ASCII {
    public static void main(String... args) {
        for (short i = 32; i < 128; i++)
            System.out.println(i + " = " + (char) i);
    }
}