package classWork_08_04_20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader second = new BufferedReader(new FileReader("C:\\Users\\roman\\IdeaProjects\\Informatics\\src\\classWork_08_04_20\\cheburashka.data"));
        BufferedReader first = new BufferedReader(new FileReader("C:\\Users\\roman\\IdeaProjects\\Informatics\\src\\classWork_08_04_20\\crocodile.data"));
        String line = second.readLine();
        String line1 = first.readLine();
        System.out.println(line);
        System.out.println(line1);

        StringTokenizer st = new StringTokenizer(line);
        Set <Integer> set = new HashSet<>();
        while (line != null) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        StringTokenizer st1 = new StringTokenizer(line1);
        while (line1 != null) {
            set.add(Integer.parseInt(st1.nextToken()));
        }
        first.close(); second.close();
        
    }
}
