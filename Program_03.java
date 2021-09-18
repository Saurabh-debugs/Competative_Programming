package CMP;

import  java.util.Scanner;

public class Program_03 {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char [] s =  str.toCharArray();
        int j = 0;
        for(int i=0;i<str.length();i++){
            j = (int)s[i];
            s[i] = (char) ((122 - j) + 97);
          //  System.out.print(s[i]);
        }
        for(int i=0;i<str.length();i++){
            System.out.print(s[i]);
        }
    }
}
