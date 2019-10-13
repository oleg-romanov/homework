package Homework_02_10_19;

import java.util.Scanner;

public class IsNegativeArr {
    public static void main(String args[]){
        System.out.println("Введите количество элементов");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int [] a = new int[n];
        int i = 0, neg = 0;
            while (i < n){
                a[i] = num.nextInt();
                if (a[i] < 0){
                    neg++;
                }
                i++;
            }
                if (neg!=0){
                    System.out.println("Есть отрицательные элементы");
                } else {
                    System.out.println("Все элементы положительны");
                }


    }
}
