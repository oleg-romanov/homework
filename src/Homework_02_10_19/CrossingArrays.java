package Homework_02_10_19;

import java.util.Scanner;

public class CrossingArrays {
    public static void main(String args[]) {
        int i = 0, k = 0, j = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Введите размер массива A");
        int n = num.nextInt();
        System.out.println("Введите размер массива В");
        int m = num.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        while (i < n) {
            System.out.println("Введите элемент массива А");
            a[i] = num.nextInt();
            i++;
        }
        i = 0;
        while (i < m) {
            System.out.println("Введите элемент массива В");
            b[i] = num.nextInt();
            i++;
        }
        int[] c = new int[n];
        i = 0;
        while (i < n) {
            while (j < m) {
                if (a[i] == b[j]) {
                    c[k] = a[i];
                    System.out.println(c[k]);
                    k++;
                }
                j++;
            }
            i++;
            j = 0;
        }

    }
}
