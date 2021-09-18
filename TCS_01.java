package CMP;

import java.util.Scanner;
public class TCS_01 {
    public static void main(String[] args) {
        System.out.println("enter the String 1");
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println("enter the second string");
        String s = sc.next();
        char []arr_01 = st.toCharArray();
        char []arr_02 = s.toCharArray();
        for(int i=0;i<st.length();i++){
            for(int j=0;j<s.length();j++){
                if(arr_01[i] == arr_02[j]){
                    System.out.print(arr_01[i] + "");
                    break;
                }


            }
        }

    }
}
