package BenchChallenges.February7;

public class LeastCommonMultiple {

    public static int lcmOfArray(int[] input) {

        int lcm = input[0];
        for(int i = 1; i < input.length; i++){
            int higher = Math.max(lcm, input[i]);
            int lower = Math.min(lcm, input[i]);
            lcm = higher;
            while(lcm % lower != 0) {
                lcm += higher;
            }
        }

        return lcm;
    }

    public static void main(String[] args) {
        System.out.println(lcmOfArray(new int[] {5, 4, 6, 46, 54, 12, 13, 17}));
        System.out.println(lcmOfArray(new int[] {46, 54, 466, 544}));
        System.out.println(lcmOfArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(lcmOfArray(new int[] {13, 6, 17, 18, 19, 20, 37}));
    }
    
}
