package CMP;
import java.util.Vector;
public class Unthinkable_01 {
    public static void Checking(Vector<String> v, String s){
        char []st = s.toCharArray();
        int n = s.length();
        for(int i=0;i<v.size();i++){
            String sp = v.get(i);
            if(sp.length() == n){
                int count = 0;
                char []se = sp.toCharArray();
                for(int j=0;j< se.length;j++){
                    if(st[j] == se[j])
                        count++;
                }
                if(count == st.length -  1){
                    System.out.println(v.get(i));
                }
            }
        }
    }
    public static void main(String[] args) {
     String s = "banana";
        Vector<String> v = new Vector<>();
        v.add("bana");
        v.add("apple");
        v.add("banaba");
        v.add("bonanza");
        v.add("banamf");
        System.out.println(v);
        Checking(v,s);
    }
}
