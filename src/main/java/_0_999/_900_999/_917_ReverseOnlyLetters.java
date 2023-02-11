package _0_999._900_999;

import java.util.HashMap;
import java.util.Map;

//917. Reverse Only Letters
public class _917_ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        Map<Integer, Character> symbols = new HashMap<>();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (!Character.isLetter(sb.charAt(i))) {
                symbols.put(i, sb.charAt(i));
            }
        }
        if (!symbols.isEmpty()) {
            symbols.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey((o1, o2) -> o2 - o1))
                    .forEach(k -> sb.deleteCharAt(k.getKey()));
        }

        sb.reverse();
        if (!symbols.isEmpty()) {
            symbols.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(k -> sb.insert((int) k.getKey(), k.getValue()));
        }
        return sb.toString();
    }

    public void solution() {
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
        System.out.println(reverseOnlyLetters("ab-cd"));
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

}
