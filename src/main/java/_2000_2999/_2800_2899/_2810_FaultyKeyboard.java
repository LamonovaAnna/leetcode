package _2000_2999._2800_2899;

// 2810. Faulty Keyboard
public class _2810_FaultyKeyboard {
    public String finalString(String s) {
        if (s.length() == 1) {
            return s;
        }

        if (s.length() == 2) {
            if (s.charAt(1) == 'i') {
                return s.substring(0, 1);
            }
            return s;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                sb.reverse();
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
