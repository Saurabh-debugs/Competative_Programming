package CMP;

import java.util.Scanner;
public class Program_02 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float []arr = new float[n];
        System.out.println("enter the element in the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextFloat();
        }
        System.out.println("Enter the another size");
        int n1 = sc.nextInt();
        float []ar = new float[n1];
        System.out.println("enter the element in the array");
        for(int i=0;i<n1;i++){
            ar[i] = sc.nextFloat();
        }
        float sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        float sum1 = 0;
        for(int i=0;i<n1;i++){
            sum1 = sum1 + ar[i];
        }
        float cost = (sum * 18) + (sum1 * 12);
        System.out.println(cost + " INR");
    }

}
