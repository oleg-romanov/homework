package Homework_06_11_19;

import java.util.Scanner;

public class Number2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите пример: ");
        String s = scan.nextLine();
        char x1, y1;
        x1 = s.charAt(0);
        y1 = s.charAt(2);
        int x = (int) x1 - '0';
        int y = (int) y1 - '0';
        int z = x + y;
        System.out.print(z);
    }
}
