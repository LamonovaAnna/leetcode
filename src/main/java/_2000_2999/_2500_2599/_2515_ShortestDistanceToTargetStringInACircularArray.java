package _2000_2999._2500_2599;

// 2515. Shortest Distance to Target String in a Circular Array
public class _2515_ShortestDistanceToTargetStringInACircularArray {
    public int closetTarget(String[] words, String target, int startIndex) {
        if (words[startIndex].equals(target)) {
            return 0;
        }

        int toLeft = startIndex - 1;
        int toRight = startIndex + 1;
        int counter = 1;


        while (toLeft != startIndex && toRight != startIndex) {
            if (toLeft < 0) {
                toLeft = words.length - 1;
            }
            if (toRight == words.length) {
                toRight = 0;
            }
            if (words[toRight].equals(target) || words[toLeft].equals(target)) {
                return counter;
            }
            toLeft--;
            toRight++;
            counter++;
        }

        return -1;
    }

    public void solution() {
        System.out.println(closetTarget(new String[]{"hello", "i", "am", "leetcode", "hello"}, "hello", 1));
        System.out.println(closetTarget(new String[]{"a", "b", "leetcode"}, "leetcode", 0));
        System.out.println(closetTarget(new String[]{"i", "eat", "leetcode"}, "ate", 0));
    }
}
