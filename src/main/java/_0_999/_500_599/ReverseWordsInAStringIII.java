package _0_999._500_599;

//557. Reverse Words in a String III
public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String str : split) {
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            result.append(sb).append(" ");
        }
        return result.deleteCharAt(result.length() -1).toString();
    }

    public void solution() {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords("God Ding"));
    }
}
