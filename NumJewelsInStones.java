import java.util.*;

public class NumJewelsInStones {
    public static void main(String[] args) {
        
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int stonesCount = 0;

        HashMap<Character, Character> map = new HashMap<>();
        for(int i =0; i< jewels.length(); i++) {
            map.put(jewels.charAt(i), jewels.charAt(i));
        }


        for(int i =0; i< stones.length(); i++) {
           if(map.get( stones.charAt(i)) != null) {
            stonesCount++;
           } 
        }

        return stonesCount;



    }
}
