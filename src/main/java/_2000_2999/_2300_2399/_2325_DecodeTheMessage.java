package _2000_2999._2300_2399;

import java.util.HashMap;
import java.util.Map;

// 2325. Decode the Message
public class _2325_DecodeTheMessage {
    public String decodeMessage(String key, String message) {
        Map<Character, Integer> alphabet = new HashMap<>();
        int counter = 0;

        for (int i = 0; i < key.length(); i++) {
            if (!alphabet.containsKey(key.charAt(i)) && Character.isLetter(key.charAt(i))) {
                alphabet.put(key.charAt(i), counter);
                counter++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (Character.isLetter(message.charAt(i))) {
                int letter = alphabet.get(message.charAt(i));
                sb.append(Character.toChars(letter + 'a'));
            } else {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public void solution() {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
        System.out.println(decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
    }
}
