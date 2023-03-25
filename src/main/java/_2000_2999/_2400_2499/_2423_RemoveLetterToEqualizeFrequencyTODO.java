package _2000_2999._2400_2499;

// 2423. Remove Letter To Equalize Frequency
public class _2423_RemoveLetterToEqualizeFrequencyTODO {
    public boolean equalFrequency(String word) {
        int[] alphabet = new int[26];
        int quantMin = 0;
        int quantMax = 0;

        for (int i = 0; i < word.length(); i++) {
            alphabet[word.charAt(i) - 'a']++;
        }

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > 0) {
                if (quantMax == alphabet[i] && quantMin == 1) {
                    return false;
                }

                if (quantMin == 0) {
                    quantMin = alphabet[i];
                } else {
                    if (alphabet[i] < quantMin) {
                        quantMax = quantMin;
                        quantMin = alphabet[i];
                    } else if (alphabet[i] > quantMin) {
                        quantMax = alphabet[i];
                    }
                }
                if (quantMax - quantMin > 1) {
                    return false;
                }
            }
        }
        return quantMax != 0 || quantMin <= 1;
    }

    public void solution() {
        System.out.println(equalFrequency("ddaccb"));
        System.out.println(equalFrequency("aazz"));
    }
}
