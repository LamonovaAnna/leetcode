package _0_999._0_99;

// 14. Longest Common Prefix
public class _14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        String firstWord = strs[0];
        for (int i = 0; i < firstWord.length(); i++) {
            char letter = firstWord.charAt(i);
            int counter = 0;
            for (int j = 1; j < strs.length; j++) {
                if (i > strs[j].length() - 1) {
                    break;
                }
                if (strs[j].charAt(i) != letter) {
                    break;
                }
                counter++;
            }
            if (counter == strs.length - 1) {
                sb.append(letter);
            } else {
                break;
            }
        }
        return sb.toString();
    }

    public void solution() {
        System.out.println(longestCommonPrefix(new String[]{"ab", "a"}));
        System.out.println(longestCommonPrefix(new String[]{"c", "acc", "ccc"}));
        System.out.println(longestCommonPrefix(new String[]{"aa", "aa"}));
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

}
