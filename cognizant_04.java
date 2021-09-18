package CMP;

import java.util.Scanner;
public class cognizant_04 {
    public static Boolean isPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n % i == 0)
                return false;

        }
     return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        if(isPrime(l)){
            if(l == r)
                System.out.println("0");
        }
        int j = r;
        for(int i=l;i<r;i++){
            if(isPrime(i) && isPrime(j)){

            }
        }
    }
}
