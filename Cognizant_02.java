package CMP;

import java.util.Scanner;
import java.util.Stack;
public class Cognizant_02 {

    static void checkforSubsequence(String S, String target) {


        Stack<Character> s = new Stack<>();


        for (int i = 0; i < target.length(); i++) {
            s.push(target.charAt(i));
        }


        for (int i = (int) S.length() - 1; i >= 0; i--) {


            if (s.empty()) {

                System.out.println("Yes");
                return;
            }


            if (S.charAt(i) == s.peek()) {


                s.pop();
            }
        }


        if (s.empty())
            System.out.println("POSITIVE");
        else
            System.out.println("NEGATIVE");
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter main string");
        String str2 = sc.next();
      //  System.out.println("enter number of cases");
        int num = sc.nextInt();
        String[] arr = new String[num];
       // System.out.println("now enter all string ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.next();
        }
        int n = str2.length();
        for (int i = 0; i < num; i++) {
            checkforSubsequence(str2, arr[i]);
        }
    }

}