package _0_999._400_499;

// 482. License Key Formatting
public class _482_LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        String newS = s.toUpperCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < newS.length(); i++) {
            if (newS.charAt(i) != '-') {
                sb.append(newS.charAt(i));
            }
        }

        for (int i = sb.length() - k; i > 0; i -= k) {
            sb.insert(i, '-');
        }

        return sb.toString();
    }

    public void solution() {
        System.out.println(licenseKeyFormatting("a0001afds-", 4));
        System.out.println(licenseKeyFormatting("r", 1));
        System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));


    }
}
