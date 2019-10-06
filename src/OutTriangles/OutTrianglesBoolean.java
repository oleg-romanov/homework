package OutTriangles;

import java.util.Scanner;

public class OutTrianglesBoolean {

    public static void main(String[] args) {
    	boolean a;
	    Scanner num = new Scanner(System.in);
	    double x = num.nextDouble();
	    double y = num.nextDouble();
	    	a = (x < 0)  && (y < 0) && (y > -1) && (x > -1) || (y > 0) && (y > x + 1) || (x > 0) && (x < 1) && (y > 0) && (y < 1) || (y < 0) && (y > -1) && (y < x - 1);
	    	if (a){
	    		System.out.print("Да");
			} else {
	    		System.out.print("Нет");
			}

    }
}
