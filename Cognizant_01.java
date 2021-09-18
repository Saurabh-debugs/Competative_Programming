package CMP;

import java.util.*;
public class Cognizant_01 {

        public static boolean isSubSequence(String str1, String str2,
                                     int m, int n)
        {

            if (m == 0)
                return true;
            if (n == 0)
                return false;


            if (str1.charAt(m - 1) == str2.charAt(n - 1))
                return isSubSequence(str1, str2, m - 1, n - 1);


            return isSubSequence(str1, str2, m, n - 1);
        }


        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter main string");
            String str2 = sc.next();
            System.out.println("enter number of cases");
            int num = sc.nextInt();
            String []arr = new String[num];
            System.out.println("now enter all string ");
            for(int i=0;i<num;i++){
                arr[i] = sc.next();
            }
            int n = str2.length();
            for(int i=0;i<num;i++){
                int m = arr[i].length();
                boolean res = isSubSequence(arr[i], str2, m, n);
                if (res)
                    System.out.println("POSITIVE");
                else
                    System.out.println("NEGATIVE");
            }



        }
    }
