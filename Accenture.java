package CMP;

import  java.util.*;
public class Accenture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(n == 0){
            System.out.println(-1);
        }else if(n<2){
            System.out.println(0);
        }else{
            int count = 0;
            for(int j=0;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[j]>arr[k]){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
