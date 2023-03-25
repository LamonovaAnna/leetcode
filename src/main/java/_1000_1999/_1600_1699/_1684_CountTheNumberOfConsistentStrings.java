package _1000_1999._1600_1699;

// 1684. Count the Number of Consistent Strings
public class _1684_CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        for (String word : words) {
            boolean correct = true;
            for (int i = 0; i < word.length(); i++) {
                if (allowed.indexOf(word.charAt(i)) == -1) {
                    correct = false;
                    break;
                }
            }
            if (correct) {
                counter++;
            }
        }
        return counter;
    }

    public void solution() {
        System.out.println(countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}));
        System.out.println(countConsistentStrings("abc", new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"}));
        System.out.println(countConsistentStrings("cad", new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"}));
    }
}
