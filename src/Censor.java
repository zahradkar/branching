public class Censor {
    public static void main(String[] args) {
        System.out.println(censor("I ate some apple", "apple", "banana"));
        System.out.println(censor("I ate some apple, orange and I finished with apple again", "apple", "banana"));
    }

    private static String censor(String text, String orig, String new2) {
        String[] temp = text.split(" ");
        String result = "";
        for (int i = 0; i < temp.length; i++)
            if (temp[i].startsWith(orig))
                result += new2 + temp[i].substring(new2.length() - 1) + " ";
            else
                result += temp[i] + " ";
        return result.substring(0, result.length() - 1);
    }
}
