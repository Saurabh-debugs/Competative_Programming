package CMP;

import java.util.Scanner;

public class IBM_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int a5 = 0;
        char ch;
        char []st = s.toCharArray();
        for(int i=0;i<st.length;i++) {
            if (st[i] == 'H') {
                a1 = a1 + 1;
            } else if (st[i] == 'C') {
                a2 = a2 + 12;
            } else if (st[i] == 'N') {
                a3 = a3 + 14;
            } else if (st[i] == 'O') {
                a4 = a4 + 16;
            } else if (st[i] == 'S') {
                a5 = a5 + 32;
            } else {
                int a = st[i];
                a = a - 48;
                if (st[i - 1] == 'H') {
                    a1 = a * a1;
                } else if (st[i - 1] == 'C') {
                    a2 = a * a2;
                } else if (st[i - 1] == 'N') {
                    a3 = a * a3;
                } else if (st[i - 1] == 'O') {
                    a4 = a * a4;
                } else if (st[i - 1] == 'S') {
                    a5 = a * a5;
                }

            }
        }
        int sum = a1 + a2 + a3 + a4 + a5;
        System.out.println(sum);
    }
}
