package CMP;

import java.util.Scanner;

public class TCS_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0 || n == 1){
            System.out.println(0);
        }else{
            if(n%2==0){
                System.out.println(n);
            }else{
                int res = (n/2)+1;
                System.out.println(res-1);
            }
        }
    }
}
