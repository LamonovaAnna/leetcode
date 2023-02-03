import java.util.HashSet;
import java.util.Set;

//929. Unique Email Addresses
public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> unique = new HashSet<>();
        for (String email : emails) {
            String[] beforeAt = email.split("@");
            StringBuilder sb = new StringBuilder(beforeAt[0]);

            while (sb.indexOf("+") != -1) {
                sb.delete(sb.indexOf("+"), sb.length());
            }
            while (sb.indexOf(".") != -1) {
                sb.deleteCharAt(sb.indexOf("."));
            }
            
            sb.append("@").append(beforeAt[1]);
            unique.add(sb.toString());
        }
        return unique.size();
    }

    public void solution() {
        System.out.println(numUniqueEmails(new String[]{"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"}));
        System.out.println(numUniqueEmails(new String[]{"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"}));
    }
}
