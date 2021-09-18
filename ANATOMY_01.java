package CMP;

import java.util.Scanner;
public class ANATOMY_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(" ------------------- ");
        while(q>0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int count = 0;
            for(int i=0;i<n;i++){
                if(arr[i] >=x && arr[i] <= y){
                    count++;
                }
            }
            System.out.println(count);
            q--;
        }
    }
}
