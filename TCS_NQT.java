package CMP;

import java.util.Scanner;

public class TCS_NQT {
    public static void Encoded(StringBuilder st){
        char ch;
        for(int i=0;i<st.length();i++){
            int as = st.charAt(i);
            if(as > 47 && as < 58){
                System.out.println("Invalid output");
                return;
            }
            else if((as > 64 && as < 91) || (as > 96 && as <123 ) ){
            ch = (char) (st.charAt(i) + 5);
            st.setCharAt(i,ch);
            }
            else {

            }
        }
        System.out.println("Encoded String is :" + st);
    }

    public static void Decoded(StringBuilder st){
        char ch;
        for(int i=0;i<st.length();i++){
            ch = (char) (st.charAt(i) - 5);
            st.setCharAt(i,ch);
        }
        System.out.println("Encoded String is :" + st);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder sb = new StringBuilder(s);
        TCS_NQT.Encoded(sb);
      //TCS_NQT.Decoded(sb);

    }
}
