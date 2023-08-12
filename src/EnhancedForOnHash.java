import java.util.HashMap;
import java.util.Map;

public class EnhancedForOnHash {
    public static void main(String[] args) {
        getValues();
    }
    private static void getKeysValues() {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Iterate over the entries using enhanced for loop
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

    private static void getKeys() {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Iterate over keys using enhanced for loop
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key);
        }
    }

    private static void getValues() {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Iterate over keys using enhanced for loop
        for (Integer value : hashMap.values()) {
            System.out.println("Value: " + value);
        }
    }
}
