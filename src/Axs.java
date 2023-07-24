import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Axs {
    public static void main(String[] args) {
        System.out.println(difference(Arrays.asList(1,2,3), Arrays.asList(2,3,4)));
    }

    private static List<Integer> difference(List<Integer> input1, List<Integer> input2){
        List<Integer> result = new ArrayList<>();
        for (byte i=0; i<input1.size(); i++)
            if (!input1.contains(input2.get(i)))
                result.add(input2.get(i));
        return result;
    }
}