package _1000_1999._1100_1199;

// 1138. Alphabet Board Path
public class _1138_AlphabetBoardPath {
    public String alphabetBoardPath(String target) {
        StringBuilder sb = new StringBuilder();
        int start = 0;

        for (int i = 0; i < target.length(); i++) {
            int end = target.charAt(i) - 'a';
            while (start != end) {
                if (start < end && end - start > 4 || end / 5 > start / 5 && start + 5 < 26) {
                    sb.append('D');
                    start += 5;
                } else if (start < end && end / 5 == start / 5) {
                    sb.append('R');
                    start++;
                } else if (start - end > 4 || end / 5 < start / 5) {
                    sb.append('U');
                    start -= 5;
                } else {
                    sb.append('L');
                    start--;
                }
            }
            sb.append('!');
        }
        return sb.toString();
    }

    public void solution() {
        System.out.println(alphabetBoardPath("zdz")); // "DDDDD!UUUUURRR!DDDDLLLD!"
    }


}
