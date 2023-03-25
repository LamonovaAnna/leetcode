package _2000_2999._2000_2099;

// 2000. Reverse Prefix of Word
public class _2000_ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int index = word.indexOf(ch);
        if (index != -1) {
            if (index == word.length() - 1) {
                sb.append(word);
                sb.reverse();
            } else {
                sb.append(word, 0, index + 1);
                sb.reverse();
                sb.append(word.substring(index + 1));
            }
        } else {
            return word;
        }
        return sb.toString();
    }

    public void solution() {
        System.out.println(reversePrefix("abcdefd", 'd'));
        System.out.println(reversePrefix("xyxzxe", 'z'));
        System.out.println(reversePrefix("abcd", 'z'));
    }
}
