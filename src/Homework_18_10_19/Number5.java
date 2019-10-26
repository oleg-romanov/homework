package Homework_18_10_19;

import java.util.Scanner;

public class Number5 {
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите размер 2D матрицы");
        int n = num.nextInt();
        int i = 0, j = 0, c = 0;
        int[][] a = new int[n][n];
        System.out.println("Введите элементы матрицы");
        while (i < n) {
            System.out.println("Новая строка");
            while (j < n) {
                System.out.println("Введите элемент А");
                a[i][j] = num.nextInt();
                j++;
            }
            i++;
            j = 0;
        }
        i = 0;
        j = 0;
        while (i < n) {
            while (j < n) {
                c = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = c;
                j++;
            }
            i++;
            j = i;
        }
        i = 0;
        j = 0;
        while (i < n) {
            while (j < n) {
                System.out.print(a[i][j]);
                j++;
            }
            System.out.println();
            i++;
            j = 0;
        }
    }
}
