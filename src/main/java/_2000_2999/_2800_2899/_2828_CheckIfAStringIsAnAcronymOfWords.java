package _2000_2999._2800_2899;

import java.util.List;

// 2828. Check if a String Is an Acronym of Words
public class _2828_CheckIfAStringIsAnAcronymOfWords {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (words.get(i).charAt(0) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public void solution() {
        System.out.println(isAcronym(List.of("alice","bob","charlie"), "abc"));
        System.out.println(isAcronym(List.of("an","apple"), "a"));
    }
}
