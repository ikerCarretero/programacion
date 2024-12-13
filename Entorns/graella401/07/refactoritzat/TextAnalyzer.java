package refactoritzat;
import java.util.HashMap;
import java.util.Map;

public class TextAnalyzer {

    private static final String PARAULA_MÉS_FREQÜENT = "Paraula més freqüent: ";
    private static final String PARAULA_MÉS_CURTA = "Paraula més curta: ";
    private static final String PARAULA_MÉS_LLARGA = "Paraula més llarga: ";
    private static final String TOTAL_DE_PARAULES = "Total de paraules: ";

    public static void main(String[] args) {
        String text = "Hola món, benvingut al món de la programació. La programació és fantàstica!";
        analyzeText(text);
    }

    public static void analyzeText(String text) {
        String[] words = text.split("\\W+");
        int wordCount = words.length;
        Map<String, Integer> frequencyMap = new HashMap<>();
        String longestWord = findLongestWord(words);
        
        String shortestWord = findShortesWord(words);

        for (String word : words) {

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

        System.out.println(TOTAL_DE_PARAULES + wordCount);
        System.out.println(PARAULA_MÉS_LLARGA + longestWord);
        System.out.println(PARAULA_MÉS_CURTA + shortestWord);
        System.out.println(PARAULA_MÉS_FREQÜENT + mostFrequentWord);
    }

    private static String findLongestWord(String[] words) {
        String longestWord = "";
        for (String word : words) {
            // Comptar les paraules
            if (longestWord.length() < word.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    private static String findShortesWord(String[] words) {
        String shortestWord = "";
        for (String word : words) {
            
            if (shortestWord.isEmpty() || shortestWord.length() > word.length()) {
                shortestWord = word;
            }
        }
        return shortestWord;
    }
}

