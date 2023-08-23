import java.util.ArrayList;
import java.util.List;

public class SubtitleMaker {
    public static void main(String[] args) {
        System.out.println(subtitleMaker("There is one sentence that is a bit longer. The second one is shorter."));
    }

    private static List<List<String>> subtitleMaker(String input) {
        String[] words = input.split(" ");
        List<List<String>> result = new ArrayList<>();
        List<String> sentence = new ArrayList<>();

        for (int index = 0; index < words.length; ) {
            if (sentence.size() < 5) {
                sentence.add(words[index++]);
                if (words[index - 1].contains(".")) {
                    result.add(new ArrayList<>(sentence));
                    sentence.clear();
                }
            } else {
                result.add(new ArrayList<>(sentence));
                sentence.clear();
            }
        }

        return result;
    }
}