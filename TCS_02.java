package CMP;

import java.util.Scanner;
public class TCS_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nth value");
        int n = sc.nextInt();
        int [] arr = new int[n+2];
        arr[0] = arr[1] = 1;
        int num = 1;
        int num1 = 1;
        for(int i=2;i< arr.length;i++){
            if(i % 2 == 0){
                num = num * 2;
                arr[i] = num;
            }else {
                num1 = num1 * 3;
                arr[i] = num1;
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(i + "--> " + arr[i]);
        }
        System.out.println();
        System.out.println("the nth value is " + arr[n-1]);
    }
}
