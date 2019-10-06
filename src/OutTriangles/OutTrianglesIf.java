package OutTriangles;

import java.util.Scanner;

public class OutTrianglesIf {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double x = num.nextDouble();
        double y = num.nextDouble();
        if (x < 0){
            if (y < 0){
                if (y > -1){
                    if (x > -1){
                        System.out.println("Да");
                    }
                }
            }
            if (y > 0){
                if (y > x + 1){
                    System.out.print("Да");
                }
            }
        }
        if (x > 0){
            if (x < 1){
                if (y > 0){
                    if (y < 1){
                        System.out.println("Да");
                    }
                }
                if (y < 0){
                    if (y > -1){
                        if (y < x - 1){
                            System.out.println("Дa");
                        }
                    }
                }
            }
        }




    }
}
