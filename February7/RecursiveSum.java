package BenchChallenges.February7;

import java.util.Arrays;

public class RecursiveSum {
    
    public static int sum(int[] arr) {
        if(arr.length < 1)
            return 0;

        return arr[arr.length-1] + sum(Arrays.copyOf(arr, arr.length-1));
    }

    public static void main(String[] args) {
        int[] thing = {1, 2, 3, 4};
        System.out.println(sum(thing));
        int[] otherThing = {};
        System.out.println(sum(otherThing));
    }

}
