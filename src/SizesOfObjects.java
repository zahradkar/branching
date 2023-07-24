import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SizesOfObjects {
    public static void main(String[] args) {
        String string = "abcdefghijklmnopqrstuvwxyz";
        String[] array = new String[]{"abcdefghijkl", "mnopqrstuvwxyz"};
        List<String> list = new ArrayList<>(Arrays.asList("abc", "def", "ghi", "jklmn", "opqrstuvwxyz"));

        System.out.println(string.length());
        System.out.println(array.length);
        System.out.println(list.size());

        System.out.println(string.charAt(0));
        System.out.println(array[0].charAt(0));
        System.out.println(list.get(0).charAt(0));

        /*
        string.length()
        array.length
        list.size()

        string.charAt()
        array[]
        list.get()
        */
    }
}