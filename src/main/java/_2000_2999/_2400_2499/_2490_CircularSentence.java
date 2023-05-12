package _2000_2999._2400_2499;

// 2490. Circular Sentence
public class _2490_CircularSentence {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");

        if (words.length == 1) {
            return words[0].charAt(0) == words[0].charAt(words[0].length() - 1);
        }

        String word1 = words[0];
        for (int i = 0; i < words.length - 1; i++) {
            String word2;
            if (i == 0) {
                word2  = words[words.length - 1];
                if (word1.charAt(0) != word2.charAt(word2.length() - 1)) {
                    return false;
                }
            }
            word2 = words[i + 1];
            if (word1.charAt(word1.length() - 1) != word2.charAt(0)) {
                return false;
            }
            word1 = word2;
        }

        return true;
    }

    public void solution() {
        System.out.println(isCircularSentence("leetcode"));
        System.out.println(isCircularSentence("eetcode"));
        System.out.println(isCircularSentence("Leetcode is cool"));
    }
}
