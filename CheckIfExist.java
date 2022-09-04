import java.util.Arrays;

public class CheckIfExist {
    public static void main(String[] args) {
        int[] findArr = {10,2,5,3};
        boolean result = checkIfExist(findArr);
        System.out.println(result);
    }

    public static boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);
        for(int i =0; i< arr.length; i++) {
            
            if(binarySearch(arr, arr[i] * 2, i)) {
                return true;
            } 
        }

        return false;
    }

    public static boolean binarySearch(int[] arr,  int num, int index ) {
        int low = 0;
        int high = arr.length-1;

        System.out.println(num);

        while(low <= high) {
            int mid = (low+high) / 2;

            if(arr[mid] == num && mid != index) {
                return true;
            }
            if(arr[mid] > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
