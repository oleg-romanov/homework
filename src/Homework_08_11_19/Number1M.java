package Homework_08_11_19;

import java.util.Scanner;

public class Number1M {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String s = scan.nextLine();
        String s1 = "";
        int posUm = 0, numberRight = 0, numberLeft = 0, num = 0, chisloLeft = 0, chisloRight = 0, composition = 1, k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '+' && s.charAt(i) != '-' && s.charAt(i) != '*') {
                k++;
            }
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || i == (s.length() - 1)) {
                if (posUm == 0) {
                    numberLeft = k;
                    k = 0;
                } else {
                    numberRight = k;
                    k = 0;
                }
            }
            if (s.charAt(i) == '*') {
                posUm = i;
                if (composition != 1){
                    numberLeft = composition;
                }
            }
            if (numberLeft != 0 && numberRight != 0) {
                System.out.println("Зашли в магию");
                int j1 = numberLeft;
                int j2 = numberRight;
                if (composition == 1) {
                    for (int j = 0; j < numberLeft; j++) {
                        num = ascii(s.charAt(posUm - j1));
                        chisloLeft += number(num, j1);
                        j1--;
                    }
                } else {
                    chisloLeft = composition;
                }
                int z = 1;
                for (int c = 0; c < numberRight; c++) {
                    num = ascii(s.charAt(posUm + z));
                    chisloRight += number(num, j2);
                    j2--;
                    z++;
                }
                composition = chisloLeft * chisloRight;
                chisloLeft = 0;
                chisloRight = 0;
                numberLeft = 1;
                numberRight = 0;
            }
        }
        System.out.print("Значение composition равно: " + composition);
    }

    public static int ascii(char x1) {
        int x = (int) x1 - '0';
        return x;
    }

    public static int number(int num, int k) {
        for (int i = 1; i < k; i++) {
            num *= 10;
        }
        return num;
    }
}
