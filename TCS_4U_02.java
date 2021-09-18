package CMP;

import java.util.Scanner;

public class TCS_4U_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int res = 0;
        int t1 = m / a;
        int t2 = n / b;
        res = num - (t1 + t2);
        System.out.println(res);
    }
}
