package Homework_23_10_19;

import java.util.FormatFlagsConversionMismatchException;
import java.util.Scanner;

public class Number2 {
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите размер массива А");
        int n = num.nextInt();
        System.out.println("Введите размер массива В");
        int m = num.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[n];

        readArray(n, a, num);
        readArray(m, b, num);
        int i = 0, j = 0, k = 0, t = 0;
        while (i < n) {
            while (j < m) {
                if (a[i] == b[j]) {
                    t++;
                }
                j++;
            }
            if (t != 0) {
                c[k] = 1;
                k++;
                t = 0;
            } else {
                c[k] = 0;
                k++;
            }
            j = 0;
            i++;
        }
        writeArray(n, c);
    }

    public static void readArray(int j, int[] d, Scanner scan) {
        for (int i = 0; i < j; i++) {
            System.out.println("Введите элемент массива");
            d[i] = scan.nextInt();
        }
    }

    public static void writeArray(int k, int[] c) {
        for (int i = 0; i < k; i++) {
            System.out.print(c[i]);
            System.out.print(" ");
        }
    }
}
