//242. Valid Anagram
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < t.length(); i++) {
                for (int j = 0; j < sb.length(); j++) {
                    if (sb.charAt(j) == t.charAt(i)) {
                        sb.deleteCharAt(j);
                        break;
                    }
                }
            }
            return sb.length() == 0;
        }
        return false;
    }

    public void solution() {
        System.out.println(isAnagram("aad", "cab"));
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));

    }
}
