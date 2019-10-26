package Homework_18_10_19;

import java.util.Scanner;

public class Number1 {
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите абциссу точки");
        double x = num.nextDouble();
        System.out.println("Введите ординату точки");
        double y = num.nextDouble();
        if (((x < 0) && (y > 0) && (y * y <= 1 - x * x)) || ((x > 0) && (y < 0) && (y * y <= 1 - x * x))) {
            System.out.println("В области");
        } else {
            System.out.println("Не входит в область");
        }
    }
}
