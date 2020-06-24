package Classwork_25_03_20;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> map = new HashMap<>();
        int m = scan.nextInt();
        readMap(map, scan, m);
    }

    public static void readMap(Map<String, List<String>> map, Scanner scan, int m) {
        for (int i = 0; i < m; i++) {
            String name = scan.next();
            String value = scan.next();
            if (!map.containsKey(name)) {
                map.put(name, new ArrayList<>());
            }
            List<String> list1 = map.get(name);
            list1.add(value);
        }

        for (String key : map.keySet()) {
            System.out.print(key + " ");
            List<String> list1 = map.get(key);
            for (int i = 0; i < list1.size(); i++) {
                System.out.print(list1.get(i));
                if (i != list1.size() - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
