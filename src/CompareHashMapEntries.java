import java.util.HashMap;
import java.util.Map;

public class CompareHashMapEntries {
    public static void main(String[] args) {
        // Create two HashMaps
        Map<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("One", 1);
        hashMap1.put("Two", 2);
        hashMap1.put("Three", 3);

        Map<String, Integer> hashMap2 = new HashMap<>();
        hashMap2.put("Two", 2);
        hashMap2.put("One", 1);
        hashMap2.put("Three", 5); // Different value

        // Compare entries using enhanced for loop
        for (Map.Entry<String, Integer> entry : hashMap1.entrySet()) {
            String key = entry.getKey();
            Integer value1 = entry.getValue();
            Integer value2 = hashMap2.getOrDefault(key, null);

            if (value2 == null) {
                System.out.println("Key '" + key + "' not present in the second HashMap");
            } else if (value1.equals(value2)) {
                System.out.println("Values for key '" + key + "' are equal: " + value1);
            } else {
                System.out.println("Values for key '" + key + "' are different: " + value1 + " and " + value2);
            }
        }
    }
}
