package _2000_2999._2100_2199;

// 2108. Find First Palindromic String in the Array
public class _2108_FindFirstPalindromicStringInTheArray {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            if (sb.toString().equals(word)) {
                return word;
            }
        }
        return "";
    }

    public void solution() {
        System.out.println(firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"}));
        System.out.println(firstPalindrome(new String[]{"notapalindrome", "racecar"}));
        System.out.println(firstPalindrome(new String[]{"def", "ghi"}));

    }
}
