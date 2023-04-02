package _1000_1999._1900_1999;

// 1910. Remove All Occurrences of a Substring
public class _1910_RemoveAllOccurrencesOfASubstring {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);

        while (sb.toString().contains(part)) {
            int start = sb.indexOf(part);
            sb.delete(start, start + part.length());
        }
        return sb.toString();
    }

    public void solution() {
        System.out.println(removeOccurrences("daabcbaabcbc", "abc"));
    }
}
