package _1000_1999._1900_1999;

// 1967. Number of Strings That Appear as Substrings in Word
public class _1967_NumberOfStringsThatAppearAsSubstringsInWord {
    public int numOfStrings(String[] patterns, String word) {
        int counter = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                counter++;
            }
        }
        return counter;
    }

    public void solution() {
        System.out.println(numOfStrings(new String[]{"a", "abc", "bc", "d"}, "abc"));
        System.out.println(numOfStrings(new String[]{"a", "b", "c"}, "aaaaabbbbb"));
        System.out.println(numOfStrings(new String[]{"a", "a", "a"}, "ab"));
    }
}
