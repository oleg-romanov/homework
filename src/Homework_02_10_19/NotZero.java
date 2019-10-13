package Homework_02_10_19;

import java.util.Scanner;

public class NotZero {
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int n = num.nextInt();
        System.out.println("Введите числа");
        int i = 0, k = 0;
        while (i < n){
            int a = num.nextInt();
            if (a == 0){
                k++;
            }
            i++;
        }
        if (k == 0){
            System.out.print("Чисел равных нулю нет");
        } else {
            System.out.print("Есть числа равные нулю");
        }
    }
}
