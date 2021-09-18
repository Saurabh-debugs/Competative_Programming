package CMP;

import java.util.Scanner;

public class LeetCode_392 {
    public static boolean isSubsequence(String s, String t) {
        char []st1 = s.toCharArray();
        char []st2 = t.toCharArray();
        int count = 0;
        int flag = 0;
        int a=0;
        for(int i=0;i< st1.length;i++){
            for( int j=a; j< st2.length;j++){
                if(st1[i] == st2[j]){
                    a = j+1;
                count++;
                    break;
                }
                flag++;
            }
            if(flag == st2.length)
                return false;
        }
        if(count == st1.length)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(isSubsequence(s1,s2));
    }
}
