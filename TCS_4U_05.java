// Remove the Duplicate element from the String and print

package CMP;


import java.util.LinkedHashSet;
import java.util.Scanner;

public class TCS_4U_05 {
    public static void main(String[] args) {

        // ------ Approch 1 By using LinkedHashSet  --- o(n) ----->
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
      /*  LinkedHashSet<Character> lh = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            lh.add(s.charAt(i));
        }
        for(Character j:lh){
            System.out.print(j);
        }  */

        //  ---- By using indexof method ----------------
        String str = new String();
        int len = s.length();
        for (int i = 0; i < len; i++)
        {
            char c = s.charAt(i);

            // if c is present in str, it returns the index of c, else it returns -1
            if (str.indexOf(c) < 0)
            {
                // adding c to str if -1 is returned
                str += c;
            }
        }
        System.out.println(str);
    }
}
