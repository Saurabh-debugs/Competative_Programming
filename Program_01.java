package CMP;

import java.util.Scanner;
public class Program_01 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element in the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[n-1];
        System.out.print(arr[n-1] + " ");
        for(int i=n-1;i>0;i--){
            if(arr[i-1]>max){
                max = arr[i-1];
                System.out.print(max + " ");
            }
        }

    }
}
