package Classwork_24_03_20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        Map<Integer, String> map = new HashMap<>();
        int arr[] = new int[m];
        readArray(arr, scan);
    }

    public static int[] readArray(int arr[], Scanner scan) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }
}
