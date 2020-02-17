package HomeWork_12_02_20;

public class Parser {
    public static int[] parser(String s, int first, int a[]) {
        int sum0 = 0, sum1 = 0;
        for (int i = 0; i < first; i++) {
            sum0 += number(ascii(s.charAt(i)), first - i);
        }
        for (int j = first + 1; j < s.length(); j++) {
            sum1 += number(ascii(s.charAt(j)), s.length() - j);
        }
        a[0] = sum0;
        a[1] = sum1;
        return a;
    }

    public static int ascii(char x1) {
        int x = (int) x1 - '0';
        return x;
    }

    public static int number(int num, int k) {
        int x = num;
        for (int i = 1; i < k; i++) {
            x *= 10;
        }
        return x;
    }
}
