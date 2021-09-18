package CMP;

import java.util.Scanner;

public class LeeCode_01_jewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
     char []st1 = jewels.toCharArray();
     char []st2 = stones.toCharArray();
     int count = 0;
     for(int i=0;i< st1.length;i++){
         for(int j=0;j< st2.length;j++){
             if(st1[i] == st2[j]){
                 count++;
             }
         }
     }
     return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(numJewelsInStones(s1,s2));
    }
}

