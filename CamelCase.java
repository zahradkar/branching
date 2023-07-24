public class CamelCase {
    public static void main(String... args) {
        System.out.println(camel("the-stealth-warrior"));
        System.out.println(camel("The_Stealth_Warrior"));
		System.out.println(camel("The_Stealth-Warrior"));
    }

    private static String camel(String input) {
        StringBuilder result = new StringBuilder(input);
        for (short i = 0; i < result.length(); i++)
            if (result.charAt(i) == '-' || result.charAt(i) == '_') {
                result.deleteCharAt(i);
                if ((int) result.charAt(i) >= 97)
                    result.setCharAt(i, (char) ((int) result.charAt(i) - 32));
            }
        return result.toString();
    }
}
