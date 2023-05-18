package _1000_1999._1000_1099;

import java.util.HashSet;
import java.util.Set;

// 1071. Greatest Common Divisor of Strings
public class _1071_GreatestCommonDivisorOfStringsTODO {
    public String gcdOfStrings(String str1, String str2) {
        String shortS;
        String longS;

        if (str1.length() > str2.length()) {
            shortS = str2;
            longS = str1;
        } else {
            shortS = str1;
            longS = str2;
        }

        if (longS.length() == 1) {
            if (longS.contains(shortS)) {
                return longS;
            } else {
                return "";
            }
        }


        int ansTimes = 0;
        String ans = "";
        Set<String> notContains = new HashSet<>();

        for (int i = 0; i < shortS.length(); i++) {
            String preAns = "";
            int times = 0;
            boolean found = false;
            String c = String.valueOf(shortS.charAt(i));
            StringBuilder sb = new StringBuilder(longS);
            int counter = i;
            while (sb.toString().contains(c)) {
                if (c.equals(ans) || notContains.contains(c)) {
                    break;
                }

                int tempTimes = 0;
                if (c.length() > ans.length()) {
                    int ind = sb.indexOf(String.valueOf(c.charAt(0)));
                    sb.delete(0, ind + c.length());
                    if (!sb.toString().contains(c)) {
                        notContains.add(c);
                        c = c.substring(0, c.length() - 1);
                        break;
                    }
                    found = true;
                    tempTimes++;
                    while (sb.toString().contains(c)) {
                        ind = sb.indexOf(String.valueOf(c.charAt(0)));
                        sb.delete(0, ind + c.length());
                        tempTimes++;
                    }
                    sb = new StringBuilder(longS);
                }

                counter++;
                if (times > tempTimes) {
                    break;
                }

                times = tempTimes;
                preAns = c;
                if (counter >= shortS.length()) {
                    break;
                }
                c = c + shortS.charAt(counter);

            }

            if (preAns.length() > ans.length() && found && times >= ansTimes) {
                ansTimes = times;
                ans = preAns;
            } else {
                notContains.add(c);
            }
        }

        return ans;
    }

    public void solution() {
        System.out.println(gcdOfStrings("ABSABS", "ABS"));
        System.out.println(gcdOfStrings("CXTXNCXTXNCXTXNCXTXNCXTXN", "CXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXN"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(gcdOfStrings("LEET", "CODE"));
    }
}
