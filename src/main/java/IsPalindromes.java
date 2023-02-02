//9. Palindrome Number
public class IsPalindromes {

    public boolean isPalindrome(int x) {
        return Integer.toString(x).equals(new StringBuilder(Integer.toString(x)).reverse().toString());
    }

    public void solution() {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(123));
    }
}
