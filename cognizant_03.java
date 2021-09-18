package CMP;


import java.util.Scanner;

public class cognizant_03 {
    public static boolean isCheck(String s1, String s2,int m,int n){
        int i = 0;
        int j = 0;
        while (j<m && i< n){
            if(s1.charAt(i) == s2.charAt(i)){
                j++;
            }
            i++;
        }
        return (j == m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int m = str.length();
        int num = sc.nextInt();
        int count = 0;
        while (count < num){
            count++;
            String s = sc.next();
            int n = s.length();
            Boolean res = isCheck(s,str,m,n);
            if(res)
                System.out.println("POSITIVE");
            else
                System.out.println("NEGATIVE");
        }
    }
}
