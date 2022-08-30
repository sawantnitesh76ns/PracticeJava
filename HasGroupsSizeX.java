import java.util.*;

class Solution {

    public static void main(String[] args) {
        int[] deck={1,1,1,2,2,2,3,3};
        boolean result = hasGroupsSizeX(deck);
        System.out.println(result);
    }
    public static boolean hasGroupsSizeX(int[] deck) {

        Arrays.sort(deck);

        int deckLength = deck.length;


        for(int i =0; i< deck.length; i++) {
            int current = deck[i];
            int countOfCards = 1;
            int index = i;
            while(index < deck.length-1 && deck[index+1] == current) {
                index++;
                countOfCards++; 
            }

            i = index;
            
            if(countOfCards >= 2  ){
                int gcdOfNums = gcd(deckLength, countOfCards);
                System.out.println(gcdOfNums);
                if(gcdOfNums!=1 &&  deckLength % gcdOfNums == 0) {
                    continue;
                } else {
                    return false;
                }
            }  else {
                return false;
            }
            
        }
        return true;
        
    }

        static int gcd(int a, int b)
        {
            int result = Math.min(a, b); // Find Minimum of a nd b
            while (result > 0) {
                if (a % result == 0 && b % result == 0) {
                    break;
                }
                result--;
            }
            return result; // return gcd of a nd b
        }
}