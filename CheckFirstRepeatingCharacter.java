package CMP;

import java.util.Scanner;


public class CheckFirstRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char []ch = s.toCharArray();
       // int count = 0;
        for(int i=0;i<ch.length;i++){
            int count = 0;
            for (int j=0;j< ch.length;j++){
                if(ch[i] == ch[j]){
                    count++;
                }
            }
            System.out.println(count);
            if(count == 1){
                System.out.println(ch[i]);
                break;
            }
        }
    }
}
