package _1000_1999._1700_1799;

// 1768. Merge Strings Alternately
public class _1768_MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < word1.length() & i < word2.length(); i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            counter = i;
        }

        if (word1.length() > word2.length()) {
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
