package CMP;

import java.util.Scanner;
public class Program_06 {
    public static void main(String[] args) {
        String []name = new String[70];
        float []height = new float[50];
        System.out.println("enter the number of for selection");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=0;i<20;i++){
            String st = sc.next();
            if(st.equals("q") || st.equals("Q")){
                break;
            }
            name[i] = st;
            count++;
        }
        System.out.println(" ------ bhar aa gye ----- ");
       for(int i=0;i<count;i++){
             height[i] = sc.nextFloat();
        }
        for(int i=0;i<height.length-1;i++){
            for(int j =0; j<height.length-1-i;j++){
                if(height[j] < height[j+1]){
                    float temp = height[j];
                    height[j] = height[j+1];
                    height[j+1] = temp;

                    String st = name[j];
                    name[j] = name[j+1];
                    name[j+1] = st;
                }
            }
        }
        for(int i=0;i<n;i++)
            System.out.println(name[i]);
    }
}
