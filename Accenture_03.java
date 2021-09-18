package CMP;
import java.util.*;
public class Accenture_03 {
    public static void main(String[] args) {
        String s = "###**";
        int count = 0;
        int count_1 = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '#')
                count++;
            else
                count_1++;
        }
        if(count_1 > count){
            System.out.println(1);
        }else if(count > count_1){
            System.out.println(-1);
        }else{
            System.out.println(0);
        }


    }
}
