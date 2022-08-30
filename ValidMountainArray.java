

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] mountArray = {0,1,2,3,4,5,6,7,8,9};
        boolean result = validMountainArray(mountArray);
        System.out.println(result);
    }

    public static boolean validMountainArray(int[] arr) {
        
        if(arr.length <= 2 ) return false;
        
        
        boolean isIncreasing = true;
        boolean isDecreasing = false;
        
        for(int i = 0; i < arr.length - 1; i++) {
            
            if(isIncreasing) {
                if(arr[i] < arr[i+1]) {
                    continue;
                } 
                else if(arr[i] == arr[i+1]) {
                    return false;
                }
                else {
                    // If Array is in decreasing order from start
                    // eg: [9, 8, 7, 6, 5, 4]
                    if(i == 0) {
                        return false;
                    }
                    isDecreasing = true;
                    isIncreasing = false;
                    continue;
                }
            }
            
            if(isDecreasing) {
                if(arr[i] > arr[i+1]) {
                    continue;
                }
                else {
                    return false;
                }
            }
        }

        return (isDecreasing)? true: false;
    }
}
