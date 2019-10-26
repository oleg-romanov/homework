package Homework_02_10_19;


import java.util.Scanner;

public class ArrayDifference {
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите размер массива А");
        int n = num.nextInt();
        System.out.println("Введите размер массива В");
        int m = num.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int i = 0, j = 0, k = 0;
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
        i = 0;
        int[] c = new int[n];
        int d = 0;
        while (i < n) {
            while (j < m) {
                if (a[i] == b[j]) {
                    d++;
                    j = m;
                }
                j++;
            }
            if (d == 0) {
                c[k] = a[i];
                System.out.println(c[k]);
            } else {
                d--;
            }
            i++;
            j = 0;
        }
    }
}
