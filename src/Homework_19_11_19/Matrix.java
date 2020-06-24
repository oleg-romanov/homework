package Homework_19_11_19;

import java.util.Scanner;

public class Matrix {
   Scanner scan = new Scanner(System.in);
    void readMatrix(int n, int m, double a[][]){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                a[i][j] = scan.nextDouble();
            }
        }
    }

    public static void writeMatrix(double a[][]){
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scan.nextInt();
        int m = scan.nextInt();
        double [][]a = new double[n][m];
    }
}
