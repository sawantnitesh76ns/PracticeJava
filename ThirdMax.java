import java.util.*;

class Solution {

    public static void main(String[] args) {
        int[] list={3,2,1};
        int result = thirdMax(list);
        System.out.println(result);
    }

    public static int thirdMax(int[] nums) {
        Integer f = null;
        Integer s = null;
        Integer t = null;
        
        for(Integer n : nums){
            if(n.equals(f) || n.equals(s) || n.equals(t)) continue;
            if(f == null || n>f){
                t = s;
                s = f;
                f = n;
            }
            else if(s == null || n>s){
                t = s;
                s = n;
            }
            else if(t == null || n>t){
                t = n;
            }
        }
        
        if(t == null)
            return f;
        else 
            return t;
    }
}