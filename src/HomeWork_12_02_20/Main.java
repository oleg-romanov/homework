package HomeWork_12_02_20;

import HomeWork_11_02_20.CharException;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) throws CharException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите пример: ");
        String s = sc.nextLine();
        int a[] = new int[2];
        int sign = 0;
        try {
            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'z') {
                    throw new CharException();
                }
                if (i == s.length() - 1 && sign != 1) {
                    throw new CharException();
                }

                switch (s.charAt(i)) {
                    case ('+'):
                        sign++;
                        parser(s, i, a);
                        addition(a);
                        break;

                    case ('-'):
                        sign++;
                        parser(s, i, a);
                        substraction(a);
                        break;

                    case ('*'):
                        sign++;
                        parser(s, i, a);
                        multiplication(a);
                        break;

                    case ('/'):
                        sign++;
                        parser(s, i, a);
                        division(a);
                        break;
                }
            }
        } catch (CharException e) {
            System.out.println("Неправильный формат");
        }
    }
}
