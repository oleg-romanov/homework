package Homework_19_11_19;

import java.util.Scanner;

public class ComplexNumber {
    double real;
    double im;
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();

    double readComplexNumber (){
        int k0 = 0, k1 = 0, d = 0;
        double num, sum0 = 0, sum1 = 0;
        for (int i = 0; i < s.length(); i++){
            if ((s.charAt(i) != '+' || s.charAt(i) != '-') && d == 0){
                k0++;
                num = ascii(s.charAt(i));
                sum0 += number(num, k0);
            } else {
                k1++;
                num = ascii(s.charAt(i));
                sum1 += number(num, k1);
            }
            if (s.charAt(i) == '+' || s.charAt(i) == '-'){
                d = 1;
            }
        }
        this.real = sum0;
        this.im = sum1;
        return this.real;
    }

    double ascii(char x1){
        double x = 0;
        x = (double)x1 - '0';
        return x;
    }
     double number(double num, int k){
        for (int i = 1; i < k; i++){
            num *=10;
        }
        return num;
    }


    public static void main(String[] args) {

    }
}
