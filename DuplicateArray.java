package CMP;

import java.util.Set;
import java.util.HashSet;
public class DuplicateArray {
    public static void main(String[] args) {
        int arr[] = {1,5,4,3,7,8,2,9};
        Set<Integer> unique = new HashSet<>();
        boolean isExit = true;
        for(int i=0;i<arr.length;i++){
            if(unique.contains(arr[i])){
               isExit = false;
                System.out.print(arr[i] +" ");
            }else {
                unique.add(arr[i]);
            }
        }
        if(isExit)
            System.out.println("there is no duplicate element");
    }


}
