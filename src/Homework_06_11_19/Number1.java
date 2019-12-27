package Homework_06_11_19;

import java.util.Scanner;

public class Number1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = new String();
        System.out.print("Введите строку: ");
        s = scan.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int length = sb.length();
        int num = 0, word = 0;
        char c;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) != ' ') {
                num++;
            } else {
                if (num != 0) {
                    word++;
                    num = 0;
                }
            }
        }
        System.out.print("Количество слов равно: ");
        System.out.print(word);
    }
}
