public class FormattedOutput {

    public static void main(String[] args) {
        String name = "John Doe";
        int age = 30;
        double height = 1.80;
        boolean isMarried = false;

        System.out.printf("Name: %s\nAge: %d\nHeight: %.2f\nIs married: %b", name, age, height, isMarried);
    }

    /*
    %s - This format specifier is used to print a string.
    %d - This format specifier is used to print an integer.
    %f - This format specifier is used to print a floating-point number.
    %c - This format specifier is used to print a character.
    %b - This format specifier is used to print a boolean value.
     */
}