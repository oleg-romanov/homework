package HomeWork_12_02_20;

import java.io.IOException;

public class Calculator extends Parser{
    public static double addition(int a[]) {
        double sum = 0;
        sum = a[0] + a[1];
        System.out.println(sum);
        return sum;
    }

    public static double substraction(int a[]) {
        double sub = a[0] - a[1];
        System.out.println(sub);
        return sub;
    }

    public static double multiplication(int a[]) {
        double mult = a[0] * a[1];
        System.out.println(mult);
        return mult;
    }

    public static void division(int a[]) {
        try {
            double div = a[0] / a[1];
            System.out.println(div);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя (ну или бесконечность)");
        }

    }

}
