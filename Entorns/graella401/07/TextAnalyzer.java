import java.util.HashMap;
import java.util.Map;

public class TextAnalyzer {

    public static void main(String[] args) {
        String text = "Hola món, benvingut al món de la programació. La programació és fantàstica!";
        analyzeText(text);
    }

    public static void analyzeText(String text) {
        String[] words = text.split("\\W+");
        int wordCount = words.length;
        String longestWord = "";
        String shortestWord = "";
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            // Comptar les paraules
            if (longestWord.length() < word.length()) {
                longestWord = word;
            }

            if (shortestWord.isEmpty() || shortestWord.length() > word.length()) {
                shortestWord = word;
            }

            // Comptar les repeticions
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // Trobar la paraula més freqüent
        String mostFrequentWord = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Total de paraules: " + wordCount);
        System.out.println("Paraula més llarga: " + longestWord);
        System.out.println("Paraula més curta: " + shortestWord);
        System.out.println("Paraula més freqüent: " + mostFrequentWord);
    }
}

