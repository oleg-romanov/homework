package Homework_02_10_19;

import java.util.Scanner;

public class AnAssotiationArrays {
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите размерность массива А");
        int n = num.nextInt();
        System.out.println("Введите размерность массива В");
        int m = num.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[n + m];
        int i = 0;
        while (i < n) {
            System.out.println("Введите элементы массива А");
            a[i] = num.nextInt();
            i++;
        }
        i = 0;

        while (i < m) {
            System.out.println("Введите элементы массива В");
            b[i] = num.nextInt();
            i++;
        }
        i = 0;
        int k = 0;
        while (k < n) {
            c[k] = a[i];
            System.out.println(c[k]);
            i++;
            k++;
        }
        i = 0;
        while (i < m) {
            c[k] = b[i];
            System.out.println(c[k]);
            i++;
            k++;
        }


    }
}

