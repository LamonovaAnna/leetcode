package _0_999._100_199;

// 151. Reverse Words in a String
public class _151_ReverseWordsInAString {
    public String reverseWords(String s) {
        if (s.isEmpty()) {
            return s;
        }
        if (s.isBlank()) {
            return "";
        }

        String[] words = s.split(" ");

        if (words.length == 1) {
            return words[0];
        }

        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isBlank()) {
                sb.append(words[i]).append(' ');
            }
        }
        return sb.toString().trim();
    }

    public void solution() {
        System.out.println(reverseWords("     a"));
    }
}
