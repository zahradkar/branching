import java.lang.StringBuilder;

public class SortString{
    public static void main(String[] args){
        System.out.println(order("is2 Thi1s T4est 3a"));
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
        System.out.println(order(""));
    }

    private static String order(String words){
        if (words.equals(""))
            return "";
        String[] temp = words.split(" ");

        short order = 1;
        StringBuilder result = new StringBuilder();
        do {
            for (short i=0;i<temp.length; i++)
                if (temp[i].contains(String.valueOf(order))){
                    result.append(temp[i] + " ");
                    order++;
                }
        } while (order<=temp.length);
        result.deleteCharAt(result.length()-1);

        return result.toString();
    }
}