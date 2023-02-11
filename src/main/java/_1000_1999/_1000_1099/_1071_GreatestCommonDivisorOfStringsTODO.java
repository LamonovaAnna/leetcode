package _1000_1999._1000_1099;

//1071. Greatest Common Divisor of Strings
public class _1071_GreatestCommonDivisorOfStringsTODO {
    public String gcdOfStrings(String str1, String str2) {
        String divider = str1;
        if (str1.length() > str2.length()) {
            divider = str2;
        }


        return null;
    }

    public void solution() {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(gcdOfStrings("LEET", "CODE"));
    }
}
