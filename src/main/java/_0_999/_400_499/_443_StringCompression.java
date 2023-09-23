package _0_999._400_499;

// 443. String Compression
public class _443_StringCompression {
    public int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }

        int counter = 1;
        int result = 0;
        int index = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] != chars[i + 1] || i == chars.length - 2) {
                boolean isCounter = false;
                if (i == chars.length - 2 && chars[i] == chars[i + 1]) {
                    counter++;
                }

                result += 1;
                chars[index] = chars[i];
                index++;
                if (counter > 1 && counter < 10) {
                    result += 1;
                    chars[index] = (char) (counter + '0');
                    isCounter = true;
                    index++;
                } else if (counter > 9) {
                    int ten = 0;
                    int temp = counter;
                    while (temp > 0) {
                        temp /= 10;
                        ten++;
                    }
                    result += ten;
                    for (int j = 0; j < String.valueOf(counter).length(); j++) {
                        chars[index] = String.valueOf(counter).charAt(j);
                        isCounter = true;
                        index++;
                    }
                }
                counter = 1;
                if (chars.length > 2 &&
                        i == chars.length - 2 &&
                        chars[i] != chars[i + 1] &&
                        index < chars.length) {
                    if (chars[i + 1] != chars[i - 1]) {
                        result += 1;
                        chars[index] = chars[i + 1];
                    } else if (chars[i + 1] == chars[i - 1] && !isCounter) {
                        result += 1;
                        chars[index] = chars[i + 1];
                    }

                }
            } else {
                counter++;
            }
        }

        return result;
    }

    public void solution() {
        System.out.println(compress(new char[]{'1','2','3','3','2'}));
        System.out.println(compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));
        System.out.println(compress(new char[]{'c', 'o', 'o'}));
        System.out.println(compress(new char[]{'a', 'a', 'a', 'a', 'b', 'a'}));
        System.out.println(compress(new char[]{'a', 'a'}));
        System.out.println(compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
        System.out.println(compress(new char[]{'a'}));
        System.out.println(compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));
        System.out.println(compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'c', 'c'}));


    }
}
