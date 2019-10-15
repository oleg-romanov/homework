package Homework_02_10_19;

import java.util.Scanner;

public class NotZeroArr {
    public static void main(String args[]){
        System.out.println("Введите количество элементов");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        System.out.println("Введите элементы массива");
        int i = 0, k = 0;
        int [] a = new int[n];
        while (i < n){
            a[i] = num.nextInt();
            if (a[i] == 0){
                k++;
            }
            i++;
        }
        if (k == 0){
            System.out.print("Нет элементов равных нулю");
        } else {
            System.out.print("Есть элементы равные нулю");
        }
    }
}
