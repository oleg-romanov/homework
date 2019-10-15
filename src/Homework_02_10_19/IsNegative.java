package Homework_02_10_19;

import java.util.Scanner;

public class IsNegative {
    public static void main(String args[]){
        System.out.println("Введите кол-во чисел");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        System.out.println("Введите числа");
        int i = 0, k = 0;
        while (i < n){
               int a = num.nextInt();
            if (a < 0){
                k = k + 1;
            }
            i++;
        }

        if (k != 0){
            System.out.println("Есть отрицательные числа");
        } else {
            System.out.println("Все числа положительные");
        }

    }
}
