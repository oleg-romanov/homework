package Homework_23_10_19;

import java.util.Scanner;

public class Number1 {
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int m = num.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[n+m];
        readArray(n,a,num);
        readArray(m,b,num);
        writeArray(b,m);
        writeArray(a,n);
    }
    public static void readArray(int n, int [] d, Scanner scan) {
        for (int i = 0; i < n; i++) {
            d[i] = scan.nextInt();
        }
    }

    public static void writeArray(int[] d, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(d[i]);
            System.out.print(" ");
        }
    }
}

