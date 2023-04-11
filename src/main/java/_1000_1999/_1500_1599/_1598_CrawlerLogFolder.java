package _1000_1999._1500_1599;

// 1598. Crawler Log Folder
public class _1598_CrawlerLogFolder {
    public int minOperations(String[] logs) {
        int counter = 0;
        for (String log : logs) {
            if (Character.isLetter(log.charAt(0)) || Character.isDigit(log.charAt(0))) {
                counter++;
            } else if (log.charAt(1) == '.') {
                if (counter > 0) {
                    counter--;
                }
            }
        }
        return Math.max(counter, 0);
    }

    public void solution() {
        System.out.println(minOperations(new String[]{"d1/", "d2/", "../", "d21/", "./"}));
    }
}
