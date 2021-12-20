public class wordMapper {
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
                System.out.println("Success");
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
    public static void main(String[] args) {
        System.out.println(compareWords("rat", "cat"));
    }
}
