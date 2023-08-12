public class SortString {
    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
        System.out.println(order(""));
    }

    public static String order(String words) {
        if (words.isEmpty())
            return "";
        String[] temp = words.split(" ");

        short order = 1;
        StringBuilder result = new StringBuilder();
        do {
            for (String s : temp)
                if (s.contains(String.valueOf(order))) {
                    result.append(s).append(" ");
                    order++;
                }

        } while (order <= temp.length);
        result.deleteCharAt(result.length() - 1);

        return result.toString();
    }
}