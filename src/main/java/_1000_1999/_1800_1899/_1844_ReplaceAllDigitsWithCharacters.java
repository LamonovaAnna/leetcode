package _1000_1999._1800_1899;

// 1844. Replace All Digits with Characters
public class _1844_ReplaceAllDigitsWithCharacters {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sb.append(Character.toChars(s.charAt(i - 1) + Integer.parseInt(String.valueOf(s.charAt(i)))));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public void solution() {
        System.out.println(replaceDigits("a1c1e1")); // "abcdef"
        System.out.println(replaceDigits("a1b2c3d4e")); // "abbdcfdhe"
    }
}
