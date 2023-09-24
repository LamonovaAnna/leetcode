package _0_999._0_99;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 17. Letter Combinations of a Phone Number
public class _17_LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if (digits.isBlank() ) {
            return new ArrayList<>();
        }
        String[] digit = digits.split("");

        List<String> ans = new ArrayList<>();
        Map<Integer, List<Character>> letters = new HashMap<>();
        letters.put(2, List.of('a', 'b', 'c'));
        letters.put(3, List.of('d', 'e', 'f'));
        letters.put(4, List.of('g', 'h', 'i'));
        letters.put(5, List.of('j', 'k', 'l'));
        letters.put(6, List.of('m', 'n', 'o'));
        letters.put(7, List.of('p', 'q', 'r', 's'));
        letters.put(8, List.of('t', 'u', 'v'));
        letters.put(9, List.of('w', 'x', 'y', 'z'));


        for (Character letter1 : letters.get(Integer.parseInt(digit[0]))) {
            StringBuilder sb = new StringBuilder();
            sb.append(letter1);
            if (digits.length() < 2) {
                ans.add(String.valueOf(sb));
                sb = new StringBuilder();
            }

            if (digit.length > 1) {
                for (Character letter2 : letters.get(Integer.parseInt(digit[1]))) {
                    sb.append(letter2);
                    if (digits.length() < 3) {
                        ans.add(String.valueOf(sb));
                        sb.deleteCharAt(sb.length() - 1);
                    }

                    if (digit.length > 2) {
                        for (Character letter3 : letters.get(Integer.parseInt(digit[2]))) {
                            sb.append(letter3);
                            if (digits.length() < 4) {
                                ans.add(String.valueOf(sb));
                                sb.deleteCharAt(sb.length() - 1);
                            }

                            if (digit.length > 3) {
                                for (Character letter4 : letters.get(Integer.parseInt(digit[3]))) {
                                    sb.append(letter4);
                                    if (digits.length() < 5) {
                                        ans.add(String.valueOf(sb));
                                        sb.deleteCharAt(sb.length() - 1);
                                    }
                                }
                                if (!sb.isEmpty()) {
                                    sb.deleteCharAt(sb.length() - 1);
                                }
                            }
                        }
                        if (!sb.isEmpty()) {
                            sb.deleteCharAt(sb.length() - 1);
                        }
                    }
                }
            }
        }

        return ans;
    }

    public void solution() {
        System.out.println(letterCombinations("2345"));
    }
}
