package _1000_1999._1800_1899;

// 1880. Check if Word Equals Summation of Two Words
public class _1880_CheckIfWordEqualsSummationOfTwoWords {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int word1 = 0;
        int word2 = 0;
        int target = 0;

        for (int i = 0; i < firstWord.length(); i++) {
            word1 *= 10;
            word1 += firstWord.charAt(i) - 'a';
        }

        for (int i = 0; i < secondWord.length(); i++) {
            word2 *= 10;
            word2 += secondWord.charAt(i) - 'a';
        }

        for (int i = 0; i < targetWord.length(); i++) {
            target *= 10;
            target += targetWord.charAt(i) - 'a';
        }

        return word1 + word2 == target;
    }


}
