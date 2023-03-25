package _1000_1999._1300_1399;

// 1309. Decrypt String from Alphabet to Integer Mapping
public class _1309_DecryptStringFromAlphabetToIntegerMapping {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                int num = Integer.parseInt(s.substring(i - 2, i));
                sb.append(Character.toChars(num - 1 + 'a'));
                i -= 2;
            } else {
                sb.append(Character.toChars(Integer.parseInt(String.valueOf(s.charAt(i))) - 1 + 'a'));
            }
        }
        return sb.reverse().toString();
    }

    public void solution() {
        System.out.println(freqAlphabets("10#11#12")); //"jkab"
        System.out.println(freqAlphabets("1326#")); //"acz"
    }
}
