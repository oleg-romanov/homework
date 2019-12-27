package Homework_15_11_19;

import java.util.Scanner;

public class Number1 {
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

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = scan.nextLine();
        String s1 = "";
        int k = 0, sum = 0, num = 0, arr = 0;
        int[] a = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '+' && s.charAt(i) != '-') {
                k++;
                System.out.println("Значение i = " + i);
                System.out.println("Значение k = " + k);
                System.out.println(' ');
            }
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || i == (s.length() - 1)) {
                if (i == s.length() - 1) {
                    i++;
                }
                int k1 = k;
                for (int j = 0; j < k1; j++) {
                    num = ascii(s.charAt(i - k));
                    System.out.println("Значение num = " + num);
                    sum += number(num, k);
                    System.out.println("Значение sum = " + sum);
                    k--;
                }
                a[arr] = sum;
                sum = 0;
                arr++;
                k = 0;
            }
        }
        for (int c = 0; c < arr; c++) {
            System.out.print(a[c]);
            System.out.print(' ');
        }
    }
}
