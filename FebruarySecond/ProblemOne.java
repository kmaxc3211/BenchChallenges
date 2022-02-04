package BenchChallenges.FebruarySecond;

import java.lang.Math;

public class ProblemOne {

    public static boolean isHeteromecic(int num){

        double determinant = Math.sqrt(1.0+(4.0*(double)num));
        double root1 = (determinant - 1)/2;
        double root2 = (determinant + 1)/2;

        if(Math.floor(root1) == root1 && root1 > 0.0){
            return true;
        }

        if(Math.floor(root2) == root2 && root2 > 0.0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHeteromecic(0));
        System.out.println(isHeteromecic(2));
        System.out.println(isHeteromecic(7));
        System.out.println(isHeteromecic(110));
        System.out.println(isHeteromecic(136));
        System.out.println(isHeteromecic(156));
    }
}