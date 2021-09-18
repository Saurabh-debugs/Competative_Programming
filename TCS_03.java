package CMP;

import java.util.Scanner;
public class TCS_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n  = sc.nextInt();
        int count  = 0;
        while (n!=0){
            n = n / 2;
            count++;
        }
        System.out.println("Required is : " + count);
    }
}
