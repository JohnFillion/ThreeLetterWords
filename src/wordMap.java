
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class wordMap {
    private HashMap<String,List<String>> wordsMap;
    private static ArrayList<String> words = new ArrayList<>();
    
    /**
     * Function to determine whether the source word and target word differ by only
     * one letter.
     * @param source Word that all other words will be compared to.
     * @param target Current word that the target word is being compared to.
     * @return
     */
    private static boolean compareWords(String source, String target) {
        int wordLength = source.length();
        int comparisonNum = wordLength - 1;
        int similarityNum = 0;
        for (int i = 0; i < wordLength; i++) {
            if (Character.compare(source.charAt(i),target.charAt(i)) == 0) {
                similarityNum += 1;
            } else {
                similarityNum += 0;
            }
        }
        if (similarityNum == comparisonNum) {
            return true;
        } else {
            return false;
        }
    }
    private static void populateWordsList(Scanner file) {
        
        while (file.hasNext()) {
            words.add(file.nextLine());
        }
        System.out.println(words);
    }
    private static void populateWordsMap() {

    }
    public static void main(String[] args) {
        System.out.println(compareWords("rat", "cat"));
        File file = new File("threeLetterWords.txt");
        Scanner scanner = new Scanner(file);
        populateWordsList(scanner);
    }

}
