public class SimplePigLatin {
    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
        System.out.println(pigIt("Hello world !"));
    }

    private static String pigIt(String str) {
        String[] temp = str.split(" ");
        String result = "";
        for (int i = 0; i < temp.length - 1; i++)
            if (temp[i].length() > 1)
                result += temp[i].substring(1) + temp[i].substring(0, 1) + "ay ";
            else
                result += temp[i];

        if (temp[temp.length - 1].length() > 1)
            result += temp[temp.length - 1].substring(1) + temp[temp.length - 1].substring(0, 1) + "ay";
        else
            result += temp[temp.length - 1];

        return result;
    }
}