package classWork_13_04_20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        long m = System.currentTimeMillis();
        BufferedReader next = new BufferedReader(new FileReader("C:/Users/roman/IdeaProjects/Informatics/src/classWork_13_04_20/text1.txt"));
        String students;
        String teachers;
        int k = 0;
        int k1 = 0;
        while ((teachers = next.readLine()) != null) {
            BufferedReader in = new BufferedReader(new FileReader("C:/Users/roman/IdeaProjects/Informatics/src/classWork_13_04_20/text.txt"));
            String s = "";
            String numberOfGroup = "";
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(teachers);
            while (st.hasMoreTokens()) {
                k++;
                if (k > 3) {
                    numberOfGroup = st.nextToken();
                    sb.append(numberOfGroup + ' ' + s + ": ");
                    k = 0;
                } else {
                    s += st.nextToken();
                    s += ' ';
                }
            }

            while ((students = in.readLine()) != null) {
                StringTokenizer sz = new StringTokenizer(students);
                StringBuilder sb1 = new StringBuilder();
                String s1;
                while (sz.hasMoreTokens()) {
                    k1++;
                    if (k1 < 4) {
                        sb1.append(sz.nextToken() + ' ');
                    } else {
                        s1 = sz.nextToken();
                        if (numberOfGroup.compareTo(s1) == 0) {
                            sb.append(sb1);
                            sb.append(", ");
                        }
                    }
                }
                k1 = 0;
            }
            System.out.println(sb);
            in.close();
        }
        next.close();
        System.out.println(System.currentTimeMillis() - m);
    }

}
