package Encrypt;

import java.util.Scanner;

public class Decrypt4 {

    public static void main(String[] args) {
        int a = 0, s = 0;

        System.out.println("Введите ключ");
        Scanner num = new Scanner(System.in);
        int k = num.nextInt();
        System.out.println("Введите сообщение, которое необходимо закодировать");

        while (a != -1) {
            a = num.nextInt();
            s = (a - k + 26) % 26;
            System.out.println(s);
        }
    }
}

