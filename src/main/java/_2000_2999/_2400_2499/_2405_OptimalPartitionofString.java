package _2000_2999._2400_2499;

// 2405. Optimal Partition of String
public class _2405_OptimalPartitionofString {
    public int partitionString(String s) {
        int j = 0;
        int counter = 0;
        int[] alphabet = new int[26];

        while (j < s.length()) {
            if (alphabet[s.charAt(j) - 'a'] != 0) {
                counter++;
                alphabet = new int[26];
            }
            alphabet[s.charAt(j) - 'a']++;
            j++;
        }
        return counter + 1;
    }

    public void solution() {
        System.out.println(partitionString("shkqbyutdvknyrpjof")); //2
        System.out.println(partitionString("ssssss")); //6
    }
}
