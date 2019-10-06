package IsPrime;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int p = num.nextInt();
        int i = 0, c, j = 0;
        while (i <= p){
            i = i + 1;
            c = p % i;
            if ( c == 0 ) {
                j = j + 1;
            }
        }
        if (j == 2){
            System.out.println("Prime");
        } else {
            System.out.print("Not Prime");
        }
    }
}
