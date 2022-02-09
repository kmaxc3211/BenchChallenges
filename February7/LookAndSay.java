package BenchChallenges.February7;

import java.math.BigInteger;

public class LookAndSay {

    public static BigInteger lookAndSay(BigInteger input){
        String strInput = input.toString();
        if(strInput.length()%2 != 0)
            return new BigInteger("-1") ;
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strInput.length()-1; i+=2){
            int times = strInput.charAt(i)-48;
            int number = strInput.charAt(i+1)-48;
            for(int j = 0; j < times; j++){
                sb.append(number);
            }
        }        

        return new BigInteger(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(lookAndSay(new BigInteger("3132")));
        System.out.println(lookAndSay(new BigInteger("1213200012171979")));
        System.out.println(lookAndSay(new BigInteger("54544666")));
        System.out.println(lookAndSay(new BigInteger("95")));
        System.out.println(lookAndSay(new BigInteger("1213141516171819")));
        System.out.println(lookAndSay(new BigInteger("120520")));
        System.out.println(lookAndSay(new BigInteger("231")));
    }
    
}
