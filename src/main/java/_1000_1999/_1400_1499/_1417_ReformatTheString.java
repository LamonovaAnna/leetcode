package _1000_1999._1400_1499;

// 1417. Reformat The String
public class _1417_ReformatTheString {
    public String reformat(String s) {
        if (s.length() == 1) {
            return s;
        }

        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                digits.append(s.charAt(i));
            } else {
                letters.append(s.charAt(i));
            }
        }

        if (letters.isEmpty() || digits.isEmpty() || Math.abs(letters.length() - digits.length()) > 1) {
            return "";
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < letters.length() & i < digits.length(); i++) {
            ans.append(letters.charAt(i)).append(digits.charAt(i));
        }

        if (letters.length() > digits.length()) {
            ans.append(letters.charAt(letters.length() - 1));
        } else if (letters.length() < digits.length()) {
            ans.insert(0,digits.charAt(digits.length() - 1));
        }

        return ans.toString();
    }

    public void solution() {
        System.out.println(reformat("a0b1c2"));
        System.out.println(reformat("leetcode"));
        System.out.println(reformat("1229857369"));
    }
}
