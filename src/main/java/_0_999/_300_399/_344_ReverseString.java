package _0_999._300_399;

//344. Reverse String
public class _344_ReverseString {
    public void reverseString(char[] s) {
        int counter = 0;
        for (int i = 0; i < s.length; i++) {
            if (counter < s.length - 1) {
                char left = s[i];
                char right = s[s.length - 1 - i];
                s[i] = right;
                s[s.length - 1 - i] = left;
                counter += 2;
            } else {
                break;
            }
        }
    }

    public void solution() {
        reverseString(new char[] {'h','e', 'l', 'l' , 'o'});
        reverseString(new char[] {'H', 'a', 'n', 'n', 'a', 'h'});
    }
}
