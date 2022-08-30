import java.util.*;

class ThirdMax {

    public static void main(String[] args) {
        int[] list={1,-2147483648,2};
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

    // Another Solution

    // public static int thirdMax(int[] nums) {
    //     Arrays.sort(nums);

    //     int n = nums.length;
        
    //     if(n < 3) {
    //         return nums[n -1];
    //     }

    //     int k = 1;
    //     while(k < 3 && n > 1) {
    //         n--;
    //         if(nums[n] != nums[n-1]) {
    //             k++;
    //         }
    //     }

    //     if(k < 3) {
    //         return nums[n-1];
    //     }

    //     return nums[n-1];
    // }
}