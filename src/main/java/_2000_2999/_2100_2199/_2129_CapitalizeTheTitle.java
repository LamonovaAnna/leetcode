package _2000_2999._2100_2199;

// 2129. Capitalize the Title
public class _2129_CapitalizeTheTitle {
    public String capitalizeTitle(String title) {
        if (title.length() < 3) {
            return title.toLowerCase();
        }

        String[] words = title.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            if (s.length() < 3) {
                sb.append(s.toLowerCase()).append(' ');
            } else {
                String word = s.toLowerCase();
                String fLetter = String.valueOf(word.charAt(0));
                word = word.replaceFirst(fLetter, fLetter.toUpperCase());
                sb.append(word).append(' ');
            }
        }
        return sb.toString().trim();
    }

    public void solution() {
        System.out.println("capiTalIze tHe titLe");
    }
}
