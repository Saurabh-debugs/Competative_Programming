package CMP;

import java.util.Scanner;

public class CodeChef_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0) {
            System.out.println("Enter string");
            String st = sc.next();
            char[] s = st.toCharArray();
            int a = 0;
            int b = 0;
            int c = 0;
            for (int i = 0; i < st.length(); i++) {
                if (s[i] == 'P') {
                    a++;
                    // System.out.println(a);
                } else if (s[i] == 'C') {
                    b++;
                    // System.out.println(b);
                } else if (s[i] == 'M') {
                    c++;
                    //System.out.println(c);
                }
            }
            if ((a > 0 && a < 2) && (b > 0 && b < 2) && (b > 0 && b < 2))
                System.out.println("YES");
            else
                System.out.println("NO");
           n--;
        }
    }
}