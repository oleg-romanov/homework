package Classwork_24_03_20;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Number1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int arr[] = new int[m];
        readArray(arr, scan);
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < arr[i]; j++) {
                int id = scan.nextInt();
                set.add(id);
            }
        }
        System.out.println(set.size());

    }

    public static int[] readArray(int arr[], Scanner scan) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }
}
