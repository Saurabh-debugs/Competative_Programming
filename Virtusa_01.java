package CMP;

import java.util.*;
public class Virtusa_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int []arr1 = new int[t];
        int []arr2 = new int[t];
        for(int i=0;i<t;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<t;i++){
            arr2[i] = sc.nextInt();
        }
       /* for(int i=0;i<t;i++){
            System.out.print(arr1[i]+" ");
        }
        for(int i=0;i<t;i++){
            System.out.print(arr2[i]+" ");
        } */
        int []res = new int[t];
        for(int i=0;i<t;i++){
            res[i] = arr1[i]/arr2[i];
        }
        for(int i=0;i<t;i++){
            System.out.println(res[i]);
        }
        int small =  0; // Integer.MAX_VALUE;
        Vector<Integer> v = new Vector<>();
        for(int i=1;i<t;i++){
            small = res[0];
            if(res[i]<=small){
                small = res[i];
                System.out.print(small+" ");
                v.add(i);
            }
        }
        System.out.println(v);
    }
}
