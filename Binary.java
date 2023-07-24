public class Binary {
    public static void main(String[] args) {
        int number = 5496;
        // Create a StringBuilder object
        StringBuilder binaryString = new StringBuilder();

        // Convert the number to binary
        while (number != 0) {
            binaryString.append(number % 2);
            number /= 2;
        }

        // Reverse the binary string
        binaryString.reverse();

        // Print the binary string
        System.out.println("The binary representation of the number is: " + binaryString);
    }
}
