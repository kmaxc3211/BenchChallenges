package BenchChallenges.FebruarySecond;

public class ProblemTwo {
    public static boolean happy(int num){

        while(true){
            int sum = 0;
            while(num!=0){
                sum+=Math.pow((num%10),2);
                num/=10;
            }
            
            if(sum == 1)
                return true;
            if(sum == 4)
                return false;
            num = sum;
        }

    }

    public static void main(String[] args) {
        System.out.println(happy(203));
        System.out.println(happy(11));
        System.out.println(happy(107));
    }
}
