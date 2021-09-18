package CMP;

import java.util.Scanner;
public class TCS_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int [] arr = new int[n];
        arr[0] = 2;
        arr[1] = 3;
        int temp = 4;
        int count = 0;
        for(int i =2;i< arr.length;i++){
            for(int j=2;j<=temp/2;j++){
                if(temp % j == 0)
                {
                    break;
                }else {
                    arr[i] = temp;
                }
            }
            temp++;
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }


}
