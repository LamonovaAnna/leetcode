package _0_999._0_99;

// 28. Find the Index of the First Occurrence in a String
public class _28_FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        int firIndex = 1;
        String forF = haystack;
        int secIndex = forF.indexOf(needle.charAt(0));
        int ans = secIndex;

        while (firIndex != needle.length()) {
            secIndex++;
            if (needle.length() > forF.length() || secIndex >= forF.length()) {
                return -1;
            }
            if (needle.charAt(firIndex) == forF.charAt(secIndex)) {
                firIndex++;
            } else {
                forF = haystack.substring(ans + 1);
                secIndex = forF.indexOf(needle.charAt(0));
                if (secIndex == -1) {
                    return -1;
                }
                ans = haystack.length() - forF.length() + secIndex;
                firIndex = 1;
            }

        }
        return ans;
    }

    public void solution() {
        System.out.println(strStr("bbaa", "aab"));
        System.out.println(strStr("mississippi", "issipi"));
        System.out.println(strStr("mississippi", "issip"));
        System.out.println(strStr("leetcode", "leeto"));
        System.out.println(strStr("sadbutsad", "sad"));
    }
}
