package _0_999._500_599;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//500. Keyboard Row
public class _500_KeyboardRow {
    public String[] findWords(String[] words) {
        List<String> ans = new ArrayList<>(words.length);

        for (String word : words) {
            int line1 = 0;
            int line2 = 0;
            int line3 = 0;
            String s = word.toLowerCase();
            for (int j = 0; j < s.length(); j++) {
                switch (s.charAt(j)) {
                    case 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' -> line1 = 1;
                }
                switch (s.charAt(j)) {
                    case 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l' -> line2 = 1;
                }
                switch (s.charAt(j)) {
                    case 'z', 'x', 'c', 'v', 'b', 'n', 'm' -> line3 = 1;
                }
            }
            if (line1 + line2 + line3 == 1) {
                ans.add(word);
            }
        }
        return ans.toArray(new String[0]);
    }

    public void solution() {
        System.out.println(Arrays.toString(findWords(new String[]{"adsdf","sfd"})));
        System.out.println(Arrays.toString(findWords(new String[]{"omk"})));
        System.out.println(Arrays.toString(findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
    }
}
