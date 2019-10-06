package NumberToPower;

import java.util.Scanner;

public class NumberToPower {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int y = 1, i = 0, num2, num4, num6, num8, num10, a = 0;
        System.out.println("Введите число");

        int x = num.nextInt();

        System.out.println("Введите степень, в которую необходимо возвести число");

        int n = num.nextInt();

        num2 = x * x;
        num4 = num2 * num2;
        num6 = num2 * num4;
        num8 = num4 * num4;
        num10 = num2 * num8;

        while ( i < n ){

            if (n % 10 == 0){
                y = y * num10;
                i+= 10;

            } else if (n % 8 == 0){
                y = y * num8;
                i+= 8;

            } else if (n % 6 == 0) {
                y = y * num6;
                i+= 6;

            } else if (n % 4 == 0){
                y = y * num4;
                i+= 4;

            } else if (n % 2 == 0){
                y = y * num2;
                i+= 2;

            } else {
                n = n + 1;
                a = n;
            }
        }
        if (n == 0){
            y = 1;
        }
        if (a != 0){
            y = y / x;
        }

        System.out.print(y);
    }
}
