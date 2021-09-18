package CMP;

import java.util.Scanner;

public class TCS_4U_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum  = 0;
        int sum1 = 0;
        if(n == 1 || n == 2){
            System.out.println(0);
        }
        for(int i=3;i<=n;i++){
            if(i%2==0){
               sum = sum +6;
            }else {
               sum1 = sum1 +7;
            }
        }
        if(n%2==0){
            System.out.println(sum);
        }else
            System.out.println(sum1);

    }
}
