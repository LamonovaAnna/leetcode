package _0_999._100_199;

//125. Valid Palindrome
public class _125_ValidPalindrome {
    public boolean isPalindrome(String s) {
       StringBuilder sb = new StringBuilder();
       String str = s.toLowerCase();
       for(int i = 0; i < str.length(); i++) {
           if (Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i))) {
               sb.append(str.charAt(i));
           }
       }


       if (sb.length() == 0 || sb.toString().equals(sb.reverse().toString())) {
           return true;
       }
       return false;
    }

    public void solution() {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }
}
