package CMP;

public class MaxPrimeNo {
    static Boolean Check(int n){
        for(int j=2;j<n/2;j++){
            if(n%j == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int []arr ={2,5,7,8,9,10,12,13,15,16,17,18,19,21};
        int n = arr.length;
        int count = 0;
        for(int i=n-1;i>=0;i--){
            if(Check(arr[i])){
                System.out.println(arr[i]);
                count++;
                break;
            }
        }
        System.out.println("required operation takes" + count);
    }
}
