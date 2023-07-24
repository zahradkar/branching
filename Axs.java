import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Axs {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Integer> inp1 = Arrays.asList(1,2,3);
        List<Integer> inp2 = Arrays.asList(2,3,4);
        System.out.println(inp1.get(0));
        System.out.println(difference(inp1, inp2));
    }

    private static List<Integer> difference(List input1, List input2){
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<input1.size(); i++)
            if (input1.contains(input2.get(i)))
                ;
            else
                result.add((Integer) input2.get(i));
        return result;

    }
}
