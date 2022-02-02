package BenchChallenges.FebuaryFirst;

public class ProblemTwo {
    public static String multiplyBy11(String input){
        boolean carry = false;
        StringBuilder in1 = new StringBuilder(input);
        StringBuilder in2 = new StringBuilder(input);
        String first = in1.append("0").reverse().toString();
        String second = in2.reverse().append("0").toString();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < first.length(); i++) {
            int sum = (first.charAt(i) - 48) + (second.charAt(i) - 48);
            if(carry){
                sum+=1;
                carry = false;
            }
            if (sum>9){
                carry = true;
                sum = sum - 10;
            }
            sb.append(sum);
        }
        if (carry)
            sb.append("1");
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(multiplyBy11("11"));
        System.out.println(multiplyBy11("23"));
        System.out.println(multiplyBy11("77"));
        System.out.println(multiplyBy11("111111111"));
        System.out.println(multiplyBy11("1213200020"));
        System.out.println(multiplyBy11("1217197941"));
        System.out.println(multiplyBy11("9473745364784876253253263723"));
    }
}
