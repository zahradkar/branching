public class AlphabetSymmetry {
    public static void main(String... args) {
		/*
		char a = 'a';
		System.out.println(((int)a) - 96);
		System.out.println(((short)'a') - 96);
		*/

        byte[] array = symmetry(new String[]{"abode", "ABc", "xyzD"});
        for (byte i : array)
            System.out.print(i + " ");
    }

    private static byte[] symmetry(String[] input) {
        byte[] result = new byte[input.length];
        byte temp = 0;
        for (short i = 0; i < input.length; i++) {
            input[i] = input[i].toLowerCase();
            for (short j = 0; j < input[i].length(); j++)
                if ((short) (input[i].charAt(j)) - 96 == j + 1)
                    temp++;

            result[i] = temp;
            temp = 0;
        }
        return result;
    }
}