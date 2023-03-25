package _1000_1999._1800_1899;

import java.util.HashSet;
import java.util.Set;

// 1805. Number of Different Integers in a String
public class _1805_NumberOfDifferentIntegersInAString {
    public int numDifferentIntegers(String word) {
        Set<String> numbers = new HashSet<>();
        int number = -1;

        for (int i = 0; i < word.length(); i++) {
            if (number == -1 && word.charAt(i) == '0' && i == word.length() - 1) {
                numbers.add("0");
            } else if (number == -1 && word.charAt(i) == '0' && Character.isLetter(word.charAt(i + 1))) {
                numbers.add("0");
            } else if (Character.isDigit(word.charAt(i))) {
                if (number == -1 && word.charAt(i) != '0') {
                    number = i;
                }
            } else {
                if (number != -1) {
                    numbers.add(word.substring(number, i));
                }
                number = -1;
            }
        }
        if (number != -1) {
            numbers.add(word.substring(number));
        }
        return numbers.size();
    }

    public void solution() {
        System.out.println(numDifferentIntegers("ubhb4xkon7yxlr0007c"));
        System.out.println(numDifferentIntegers("leet1234code234"));
        System.out.println(numDifferentIntegers("a1b01c001"));
    }
}
