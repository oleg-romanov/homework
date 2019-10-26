package Homework_18_10_19;

import java.util.Scanner;

public class Number3 {
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите размер потока данных");
        int n = num.nextInt();
        int a = 0, b = 0, i = 0, b0 = 0;
        while  (i< (n/3)){
            System.out.println("Введите число А");
            a = num.nextInt();
            b0 = a;
            a = num.nextInt();
            b0 = b0 + a;
            a = num.nextInt();
            b = b0 + a;
            System.out.println("Значение б равно: "+ b);
            b0 = 0;
            i++;
        }
    }
}
