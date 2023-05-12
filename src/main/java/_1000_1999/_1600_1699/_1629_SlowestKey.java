package _1000_1999._1600_1699;

// 1629. Slowest Key
public class _1629_SlowestKey {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int[] alphabet = new int[26];

        for (int i = 0; i < keysPressed.length(); i++) {
            int letter = keysPressed.charAt(i) - 'a';
            if (i == 0) {
                alphabet[letter] = releaseTimes[i];
            } else {
                int time = releaseTimes[i] - releaseTimes[i - 1];
                if (time > alphabet[letter]) {
                    alphabet[letter] = time;
                }
            }
        }

        int letter = -1;
        int max = 0;
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] >= max) {
                max = alphabet[i];
                letter = i;
            }
        }
        letter += 'a';
        return (char) letter;
    }

    public void solution() {
        System.out.println(slowestKey(new int[] {9,29,49,50}, "cbcd"));
    }
}
