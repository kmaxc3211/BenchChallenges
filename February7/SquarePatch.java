package BenchChallenges.February7;

import java.util.Arrays;

public class SquarePatch {

    public static int[][] squarePatch(int input){
        if(input == 0)
            return new int[0][0];
        
        int[][] out = new int[input][input];
        for(int i = 0; i < input; i++){
            Arrays.fill(out[i], input);
        }
        
        return out;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(squarePatch(0)));
        System.out.println(Arrays.deepToString(squarePatch(1)));
        System.out.println(Arrays.deepToString(squarePatch(3)));
        System.out.println(Arrays.deepToString(squarePatch(5)));
    }
    
}
