import java.util.logging.Level;
import java.util.logging.Logger;

public class ASCII {
    public static void main(String... args) {
        ASCII1();
    }

    private static void ASCII1() {
        for (short i = 32; i < 128; i++)
            System.out.println(i + " = " + (char) i);
    }
}