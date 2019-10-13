package Homework_02_10_19;

import java.util.Scanner;

public class IsX {
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        System.out.println("Введите Х");
        int x = num.nextInt();
        System.out.println("Введите количество чисел");
        int n = num.nextInt();
        int i = 0;
        System.out.print("Введите числа");
        while (i < n){
            int a = num.nextInt();
            if (a == x){
                i = n;
            }
            i++;
        }
        if (i > n){
            System.out.print("Есть чисел равные Х");
        } else {
            System.out.print("Нет чисел равных Х");
        }
    }
}
