package _1000_1999._1900_1999;

// 1957. Delete Characters to Make Fancy String
public class _1957_DeleteCharactersToMakeFancyString {
    public String makeFancyString(String s) {
        if (s.length() < 3) {
            return s;
        }
        int counter = 0;
        char lastChar = s.charAt(0);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == lastChar) {
                counter++;
            } else {
                lastChar = s.charAt(i);
                counter = 1;
            }

            if (counter < 3) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public void solution() {
        System.out.println(makeFancyString("leeetcode"));
        System.out.println(makeFancyString("aaabaaaa"));
        System.out.println(makeFancyString("aab"));

    }
}
