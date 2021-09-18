package CMP;

// Remove the duplicate element in sorted Array
// time complexity is  o(n) -->
import java.util.Scanner;

public class RemoveDuplicateInSortedArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array");
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // creating the temp array
        int ar[] = new int[n];
        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!= arr[i+1]){
                ar[j] = arr[i];
                j++;
            }
        }
        ar[j] = arr[n-1];
        for(int i=0;ar[i]!=0;i++){
            System.out.println(ar[i]);
        }
    }
}
