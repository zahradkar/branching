import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> str = Optional.of("Hello, world!");
        System.out.println(str.isPresent());// true
        str.ifPresent(str1 -> System.out.println(str1.length())); //13
        System.out.println(str.get()); // "Hello, world!"

        Optional<String> emptystr = Optional.empty();
        System.out.println(emptystr.isPresent());// false
        emptystr.ifPresent(str2 -> System.out.println(str2.length()));//skip this line
        System.out.println(emptystr.orElse("default"));// "default"

        String nullStr = null;
        Optional<String> nullablestr = Optional.ofNullable(nullStr);
        System.out.println(nullablestr.isPresent()); //false
        System.out.println(nullablestr.orElse("default")); // "default"
    }
}
