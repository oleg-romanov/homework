package Homework_02_10_19;

import java.util.Scanner;

public class IsXArr {
    public static void main (String args[]){
        Scanner num = new Scanner(System.in);
        System.out.println("Введите значение Х");
        int x = num.nextInt();
        System.out.println("Введите количество элементов массива");
        int n = num.nextInt();
        int i = 0;
        int [] a = new int[n];
        while (i < n){
            a[i] = num.nextInt();
            if (a[i] == x){
                i = n;
            }
            i++;
        }
        if (i > n){
            System.out.print("Есть элементы равные X");
        } else {
            System.out.print("Нет элементов равных Х");
        }

    }
}
