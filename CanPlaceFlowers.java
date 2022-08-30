public class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] flowerbedArr = {0,1};
        boolean result = betterApproach(flowerbedArr, 5);
        System.out.println(result);
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        if(n == 0) return true;

        if(flowerbed.length == 1 && flowerbed[0] == 0) return true;
        
        for(int i =0; i< flowerbed.length; i++) {
            if(flowerbed[i] == 0) {
                if(i == 0 && flowerbed[i+1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                } else if(i == flowerbed.length-1 && flowerbed[i-1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                } else if( i > 0 && i < flowerbed.length-2 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        return (n <= 0)? true : false;
    }

    public static boolean betterApproach(int[] flowerbed, int n) {
        
        
        if(flowerbed[0] != 1) {
            flowerbed[0] = 1;
            n--;
        }
        
        for(int i =1; i< flowerbed.length; i++) {
            if(flowerbed[i-1] == 1 && flowerbed[i] == 1) {
                flowerbed[i-1] = 0;
                n++;
            } 
            if(flowerbed[i-1] != 1 && flowerbed[i] != 0) {
                flowerbed[i] = 1;
                n--;
            }
        }

        return (n <= 0)? true : false;
    }
}
