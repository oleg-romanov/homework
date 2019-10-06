package Triangle;

import java.util.Scanner;

public class TriangleBoolean {

    public static void main(String[] args) {
        boolean a;
        Scanner num = new Scanner(System.in);
        double x = num.nextDouble();
        double y = num.nextDouble();
        a = (y < x + 1) && (y < -x + 1) && (y > 0);
        if (a) {
            System.out.print("Да");
        } else {
            System.out.print("Нет");
        }
    }
}

