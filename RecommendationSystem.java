import java.util.*;

public class RecommendationSystem {

    public static void main(String[] args) {

        // User preferences
        Map<String, List<String>> userPreferences = new HashMap<>();
        userPreferences.put("Alice", Arrays.asList("Technology", "Books"));
        userPreferences.put("Bob", Arrays.asList("Sports", "Movies"));

        // Items and categories
        Map<String, String> items = new HashMap<>();
        items.put("Java Programming Book", "Technology");
        items.put("AI Basics Book", "Technology");
        items.put("Football Match", "Sports");
        items.put("Action Movie", "Movies");

        String user = "Alice";
        System.out.println("Recommendations for " + user + ":");

        // Recommendation logic
        for (Map.Entry<String, String> item : items.entrySet()) {
            if (userPreferences.get(user).contains(item.getValue())) {
                System.out.println("- " + item.getKey());
            }
        }
    }
}
