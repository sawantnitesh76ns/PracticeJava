import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int[] result = twoSum(nums, 6);
        System.out.println(result);
    }

    public static int[] twoSum(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int i = 0; i< nums.length; i++) {
            if(map.get(target - nums[i]) != null &&  map.get(target - nums[i]) != i ) {
                result.add(i);
                result.add(map.get(target- nums[i]));
                break;
            }
        }

        int[] finalResult = {result.get(0), result.get(1)};

        return finalResult;


    };
}
