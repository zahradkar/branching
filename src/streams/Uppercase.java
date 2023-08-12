package streams;

public class Uppercase {
    public static void main(String[] args) {
        String s = "Lorem Ipsum Dolor Sit Amet, Consectetur Adipiscing Elit. Morbi nec mattis odio.";
//        s.chars().filter(x -> (x >= 'A' && x <= 'Z')).forEach(c -> System.out.println((char)c));
        s.chars().filter(Character::isUpperCase).forEach(c -> System.out.println((char)c));
    }
}
