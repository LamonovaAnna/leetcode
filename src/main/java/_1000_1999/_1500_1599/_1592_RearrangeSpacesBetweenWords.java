package _1000_1999._1500_1599;

// 1592. Rearrange Spaces Between Words
public class _1592_RearrangeSpacesBetweenWords {
    public String reorderSpaces(String text) {
        if (text.length() == 1) {
            return text;
        }
        String[] words = text.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        if (words.length == 1) {
            if (words[0].length() == text.length()) {
                return text;
            }
            int addSpaces = text.length() - words[0].length();
            sb.append(words[0]);
            sb.append(" ".repeat(addSpaces));
            return sb.toString();
        }

        int wordsLength = 0;

        for (String word : words) {
            wordsLength += word.length();
        }

        int spaces = (text.length() - wordsLength) / (words.length - 1);
        int addSpaces = (text.length() - wordsLength) % (words.length - 1);

        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i < words.length - 1) {
                sb.append(" ".repeat(Math.max(0, spaces)));
            }
        }

        if (addSpaces > 0) {
            sb.append(" ".repeat(addSpaces));
        }
        return sb.toString();
    }

    public void solution() {
        System.out.println(reorderSpaces("  hello"));
    }

}
