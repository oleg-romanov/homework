package Homework_08_11_19;

import java.util.Scanner;

public class Number1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите выражение: ");
        String s = scan.nextLine();
        int k = 0, sum = 0, num = 0, ch = 0, nums = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '+') {
                k++;
            }
            if (s.charAt(i) == '+' || i  == s.length() - 1) {
                nums = k;
                if (ch == i){
                    num = ascii(s.charAt(ch));
                    sum = sum + num;
                }
                while (ch < i) {
                    num = ascii(s.charAt(ch));
                    sum = sum + number(num, k);
                    k--;
                    ch++;
                }
                ch = i + 1;
                k = 0;
            }
        }
        System.out.print("Результат: " + sum);
    }

    public static int ascii(char x1) {
        int x = (int) x1 - '0';
        return x;
    }

    public static int number(int num, int k) {
        for (int i = 1; i < k; i++) {
            num *= 10;
        }
        return num;
    }
}