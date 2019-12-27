package Homework_06_11_19;

public class Number3 {
    public static void main(String args[]) {
        String s = "hello";
        int length = s.length();
        StringBuilder sb = new StringBuilder(s);
        char c;
        for (int i = 0; i < length; i++) {
            c = sb.charAt(i);
        }
    }
}
