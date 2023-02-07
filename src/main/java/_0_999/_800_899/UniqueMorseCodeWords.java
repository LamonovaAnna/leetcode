package _0_999._800_899;

import java.util.LinkedHashSet;
import java.util.Set;

//804. Unique Morse Code Words
public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] alphabet = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
                ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> unique = new LinkedHashSet<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word.length());
            for (int i = 0; i < word.length(); i++) {
                sb.append(alphabet[word.charAt(i) - 97]);
            }
            unique.add(sb.toString());
        }

        return unique.size();
    }

    public void solution() {
        System.out.println(uniqueMorseRepresentations(new String[] {"gin","zen","gig","msg"}));
        System.out.println(uniqueMorseRepresentations(new String[] {"a"}));
    }
}
