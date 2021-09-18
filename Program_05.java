package CMP;

import java.util.Scanner;
public class Program_05 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int n = 7;
        int j = n-1;
        int l = 0;
        int [] ar = new int[n];
        for(int i=0;i<n;i++){
            if(i%2==0){
                ar[i] = arr[j];
                j--;
            }else {
                ar[i] = arr[l];
                l++;
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(ar[i] + " ");
        }
    }
}
