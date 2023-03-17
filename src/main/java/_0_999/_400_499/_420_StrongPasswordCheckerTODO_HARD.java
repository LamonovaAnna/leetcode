package _0_999._400_499;

// 420. Strong Password Checker
public class _420_StrongPasswordCheckerTODO_HARD {
    public int strongPasswordChecker(String password) {
        final int MIN_LENGTH = 6;
        final int MAX_LENGTH = 20;
        final int LOWERCASE_QYT = 1;
        final int UPPERCASE_QYT = 1;
        final int DIGIT_QYT = 1;
        final int MAX_REPEATED_CHAR = 2;

        int incrLength = Math.max(MIN_LENGTH - password.length(), 0);
        int decrLength = Math.max(password.length() - MAX_LENGTH, 0);

        int lowerCaseCounter = 0;
        int upperCaseCounter = 0;
        int digitsCounter = 0;
        int repeatedCounter = 1;
        int repeatedQyt = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                lowerCaseCounter++;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                upperCaseCounter++;
            }
            if (Character.isDigit(password.charAt(i))) {
                digitsCounter++;
            }

            if (password.length() > MAX_REPEATED_CHAR) {
                if (i != password.length() - 1 && password.charAt(i) == password.charAt(i + 1)) {
                    repeatedCounter++;
                    if (repeatedCounter > MAX_REPEATED_CHAR) {
                        repeatedQyt++;
                        repeatedCounter = 0;
                    }
                } else {
                    repeatedCounter = 1;
                }
            }
        }

        int change = 0;
        if (lowerCaseCounter < LOWERCASE_QYT) {
            change++;
        }
        if (upperCaseCounter < UPPERCASE_QYT) {
            change++;
        }
        if (digitsCounter < DIGIT_QYT) {
            change++;
        }

        if (incrLength != 0) {
            if (change <= incrLength && repeatedQyt == 0) {
                return incrLength;
            } else if (change > incrLength && repeatedQyt == 0) {
                return change;
            } else if (change < incrLength) {
                return change + incrLength;
            } else {
                return change + repeatedQyt;
            }
        }

        if (decrLength != 0) {
            if (change <= decrLength && repeatedQyt == 0) {
                return change + decrLength;
            } else if (change < decrLength && repeatedQyt >= decrLength) {
                return (repeatedQyt - change) + (decrLength / repeatedQyt) + decrLength;
            } else if (change < decrLength) {
                return decrLength + change;
            } else {
                return (change + repeatedQyt) - decrLength;
            }
        }

        if (repeatedQyt == 0) {
            return change;
        }
        return repeatedQyt;
    }

    public void solution() {
        System.out.println(strongPasswordChecker("bbaaaaaaaaaaaaaaacccccc")); // 8
        System.out.println(strongPasswordChecker("aaaabbbbccccddeeddeeddeedd")); //8
        System.out.println(strongPasswordChecker("aaaaAAAAAA000000123456")); // 5

        System.out.println(strongPasswordChecker("ABABABABABABABABABAB1")); // 2
        System.out.println(strongPasswordChecker("1111111111")); // 3
        System.out.println(strongPasswordChecker("aaa111")); //2
        System.out.println(strongPasswordChecker("1337C0d3")); //0
        System.out.println(strongPasswordChecker("a")); //5
        System.out.println(strongPasswordChecker("aA1")); //3

    }
}
