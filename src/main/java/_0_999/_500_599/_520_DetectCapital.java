package _0_999._500_599;

// 520. Detect Capital
public class _520_DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) {
            return true;
        }
        char[] letters = word.toCharArray();

        if (Character.isLowerCase(letters[0])) {
            for (int i = 1; i < letters.length; i++) {
                if (!Character.isLowerCase(letters[i])) {
                    return false;
                }
            }
        } else {
            if (Character.isLowerCase(letters[1])) {
                for (int i = 1; i < letters.length; i++) {
                    if (!Character.isLowerCase(letters[i])) {
                        return false;
                    }
                }
            } else {
                for (int i = 1; i < letters.length; i++) {
                    if (Character.isLowerCase(letters[i])) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public void solution() {
        System.out.println(detectCapitalUse("USA"));
    }
}
