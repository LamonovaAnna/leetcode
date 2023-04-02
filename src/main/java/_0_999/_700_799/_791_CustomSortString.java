package _0_999._700_799;

// 791. Custom Sort String
public class _791_CustomSortString {
    public String customSortString(String order, String s) {
        int[] alphabet = new int[26];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < order.length(); i++) {
            alphabet[order.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            int letter = s.charAt(i) - 'a';
            if (alphabet[letter] > 0) {
                alphabet[letter]++;
            } else {
                sb.append(s.charAt(i));
            }
        }


        for (int i = 0; i < order.length(); i++) {
            int num = alphabet[order.charAt(i) - 'a'];
            while (num > 1) {
                sb.append(order.charAt(i));
                num--;
            }
        }
        return sb.toString();
    }

    public void solution() {
        System.out.println(customSortString("cba", "abcd"));
    }
}
