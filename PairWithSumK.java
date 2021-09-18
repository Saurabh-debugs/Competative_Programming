package CMP;

import java.util.Scanner;
public class PairWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println("Enter the value of sum");
        int sum  = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;
        while (low < high){
            if(arr[low] + arr[high] > sum){
                high--;
            }else if(arr[low] + arr[high] < sum){
                low++;
            }else if(arr[low] + arr[high] == sum){
                System.out.println("pair is" + " " + arr[low] + " , " + arr[high]);
                low++;
                high--;

            }
        }
    }
}
