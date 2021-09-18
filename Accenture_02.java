package CMP;

import java.util.*;
public class Accenture_02 {
    static int gcd(int a,int b){
        {
            if (b == 0)
                return a;
            return gcd(b,a%b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(n==0){
            System.out.println(-1);
        }else{
            Arrays.sort(arr);
            int small = arr[0];
            int largest  = arr[n-1];
          int ans  = gcd(largest, small);
            System.out.println(ans);
        }
    }
}
