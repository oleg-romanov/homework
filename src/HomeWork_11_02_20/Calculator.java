package HomeWork_11_02_20;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите пример: ");
        String s = sc.nextLine();
        int first = 0;
        int second = 0;
        int a[] = new int[2];

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ('+'):
                    first = i;
                    second = s.length() - i;
                    parser(s, first, second, a);
                    addition(a);
                    break;

                case ('-'):
                    first = i;
                    second = s.length() - i;
                    parser(s, first, second, a);
                    substraction(a);
                    break;

                case ('*'):
                    first = i;
                    second = s.length() - i;
                    parser(s, first, second, a);
                    multiplication(a);
                    break;

                case ('/'):
                    first = i;
                    second = s.length() - i;
                    parser(s, first, second, a);
                    division(a);
                    break;
            }
        }
    }

    public static double addition(int a[]) {
        double sum = 0;
        sum = a[0] + a[1];
        System.out.println(sum);
        return sum;
    }

    public static double substraction(int a[]) {
        double sub = a[0] - a[1];
        System.out.println(sub);
        return sub;
    }

    public static double multiplication(int a[]) {
        double mult = a[0] * a[1];
        System.out.println(mult);
        return mult;
    }

    public static void division(int a[]) throws IOException {
        try {
            double div = a[0] / a[1];
            System.out.println(div);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! На ноль делить нельзя! (ну или бесконечность) ಠ︵ಠ");
        }
    }

    public static int ascii(char x1) {
        int x = (int) x1 - '0';
        return x;
    }

    public static int[] parser(String s, int first, int second, int a[]) {
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

    public static int number(int num, int k) {
        int x = num;
        for (int i = 1; i < k; i++) {
            x *= 10;
        }
        return x;
    }

}

