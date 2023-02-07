package _0_999._700_799;

//748. Shortest Completing Word
public class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {

        StringBuilder letters = new StringBuilder();
        for (int m = 0; m < licensePlate.length(); m++) {
            if (Character.isLetter(licensePlate.charAt(m))) {
                String letter = String.valueOf(licensePlate.charAt(m));
                letters.append(letter.toLowerCase());
            }
        }

        int lengthCounter = 0;
        int place = 0;

        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(letters);
            for (int j = 0; j < words[i].length(); j++) {
                for (int l = 0; l < sb.length(); l++) {
                    if (words[i].charAt(j) == sb.charAt(l)) {
                        sb.deleteCharAt(l);
                        break;
                    }
                }
            }

            if (sb.length() != 0 || lengthCounter < words[i].length() && lengthCounter != 0 ) {
                words[i] = null;
            } else if (lengthCounter > words[i].length()){
                lengthCounter = words[i].length();
                words[place] = null;
                place = i;
            } else if (lengthCounter == 0) {
                lengthCounter = words[i].length();
                place = i;
            } else if (lengthCounter == words[i].length()) {
                words[i] = null;
            }
        }

        String result = null;
        for (String word : words) {
            if (word != null) {
                result = word;
                break;
            }
        }
        return result;
    }

    public void solution() {
        System.out.println(shortestCompletingWord("AN87005", new String[]{"participant","individual",
                "start","exist","above","already","easy","attack","player","important"}));
        System.out.println(shortestCompletingWord("1s3 456", new String[]{"looks", "pest", "stew", "show"}));
        System.out.println(shortestCompletingWord("1s3 PSt", new String[]{"step", "steps", "stripe", "stepple"}));

    }
}
