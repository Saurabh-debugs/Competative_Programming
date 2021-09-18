package CMP;

import java.util.*;
public class CodechefLongChallege_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        while (n > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int arr[] = new int[a];
            for (int i = 0; i < a; i++) {
                int res = i%c;
                arr[i] = res;
            }

            Arrays.sort(arr);
            System.out.println();

            if(b>c-1){
                int temp = b%c;
                int i;
                for ( i = 0; i < a; i++) {
                    if (arr[i]  == temp) {

                        break;
                    }
                }
                System.out.println(i+2);
            }else{
                int temp = b%c;
                int i;
                for (i = 0; i < a; i++) {
                    if (arr[i] == temp) {
                        break;
                    }
                }
                System.out.println(i+1);
            }


            n--;
        }
    }
}


