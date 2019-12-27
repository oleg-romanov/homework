package Homework_12_11_19;

import java.util.Scanner;

class Number1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку:  ");
        String s = scan.nextLine();
        String sum = "";
        for (int i =0; i < s.length(); i++){
            sum += s.charAt(i);
        }
        System.out.println(sum);
    }

}