package _2000_2999._2100_2199;

// 2125. Number of Laser Beams in a Bank
public class _2125_NumberOfLaserBeamsInABank {
    public int numberOfBeams(String[] bank) {
        if (bank.length == 1) {
            return 0;
        }

        int[] beams = new int[bank.length];

        int pos = 0;
        for (int i = 0; i < bank.length; i++) {
            int sum = 0;
            for (char c : bank[i].toCharArray()) {
                sum += (c - '0');
            }
            if (sum != 0) {
                beams[pos] = sum;
                pos++;
            }
        }

        int sum = 0;
        for (int i = 0; i < beams.length - 1; i++) {
            if (beams[i] == 0) {
                break;
            }
            sum += beams[i] * beams[i + 1];
        }

        return sum;
    }

    public void solution() {
        System.out.println(numberOfBeams(new String[] {"011001","000000","010100","001000"}));
    }
}
