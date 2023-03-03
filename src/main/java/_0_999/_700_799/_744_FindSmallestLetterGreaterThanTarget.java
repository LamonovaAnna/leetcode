package _0_999._700_799;

// 744. Find Smallest Letter Greater Than Target
public class _744_FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char letter : letters) {
            if (letter - 'a' > target - 'a') {
                return letter;
            }
        }
        System.gc();
        return letters[0];
    }

    public void solution() {
        System.out.println(nextGreatestLetter(new char[] {'c','f','j'}, 'a'));
        System.out.println(nextGreatestLetter(new char[] {'c','f','j'}, 'd'));
        System.out.println(nextGreatestLetter(new char[] {'c','f','j'}, 'c'));
        System.out.println(nextGreatestLetter(new char[] {'x','x','y', 'y'}, 'z'));
    }
}
