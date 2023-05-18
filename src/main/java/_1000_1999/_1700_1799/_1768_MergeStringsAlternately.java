package _1000_1999._1700_1799;

// 1768. Merge Strings Alternately
public class _1768_MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        char[] firstWord = word1.toCharArray();
        char[] secondWord = word2.toCharArray();

        StringBuilder sb = new StringBuilder();
        int counter = 0;

        for (int i = 0; i < firstWord.length & i < secondWord.length; i++) {
            sb.append(firstWord[i]);
            sb.append(secondWord[i]);
            counter = i;
        }

        if (firstWord.length > secondWord.length) {
            sb.append(word1.substring(counter + 1));
        } else {
            sb.append(word2.substring(counter + 1));
        }
        return sb.toString();
    }

    public void solution() {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately("abcd", "pq"));
    }
}
