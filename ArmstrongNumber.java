package CMP;

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int org = n;
        int num = n;
        int count = 0;
        while (org !=0){
            org = org/10;
            count++;
        }
        int sum = 0;

        while (n !=0){
            int rem = n % 10;
            sum = sum + (int) Math.pow(rem,count);
            n = n /10;
        }
        if(sum == num)
            System.out.println("given number is armstrong");
        else System.out.println("not");
    }
}
