package Triangle;

import java.util.Scanner;

public class TriangleIf {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double x = num.nextDouble();
        double y = num.nextDouble();
        if ( y <  x + 1 ){
            if ( y < -x + 1 ){
                if ( y > 0 ){
                    System.out.print("Да");
                }
            }
        }
    }
}
