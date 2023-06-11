package _0_999._800_899;

import java.util.*;

// 811. Subdomain Visit Count
public class _811_SubdomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> count = new HashMap<>();

        for (String cpdomain : cpdomains) {
            String[] dom = cpdomain.split("\\.");
            String[] num = cpdomain.split(" ");
            int number = Integer.parseInt(num[0]);
            if (!count.containsKey(num[1])) {
                count.put(num[1], number);
            } else {
                count.put(num[1], count.get(num[1]) + number);
            }

            StringBuilder sb = new StringBuilder();
            for (int j = dom.length - 1; j > 0; j--) {
                if (sb.isEmpty()) {
                    sb.append(dom[j]);
                } else {
                    sb.insert(0, ".").insert(0, dom[j]);
                }

                String address = sb.toString();
                if (!count.containsKey(address)) {
                    count.put(address, number);
                } else {
                    count.put(address, count.get(address) + number);
                }
            }
        }

        List<String> ans = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            ans.add(entry.getValue() + " " + entry.getKey());
        }

        return ans;
    }

    public void solution() {
        System.out.println(subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}));
        // ["901 mail.com",a
        // "50 yahoo.com",a
        // "900 google.mail.com",a
        // "5 wiki.org",a
        // "5 org",a
        // "1 intel.mail.com",a
        // "951 com"]a
    }
}
