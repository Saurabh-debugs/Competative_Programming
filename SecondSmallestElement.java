package CMP;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int arr[] = {1,7,4,34,18,78};
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
            if(arr[i] > smallest && arr[i] < second){
                second = arr[i];
            }
        }
        System.out.println("Second smallest element is " + second);
    }
}
