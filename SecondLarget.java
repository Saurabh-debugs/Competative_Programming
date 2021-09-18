package CMP;

public class SecondLarget {
    public static void main(String[] args) {
        int arr[] = {1,7,4,34,18,78};
        int Largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > Largest){
                Largest = arr[i];
            }
            if(arr[i] < Largest && arr[i] > second){
                second = arr[i];
            }
        }
        System.out.println("Second smallest element is " + second);
    }
    }

