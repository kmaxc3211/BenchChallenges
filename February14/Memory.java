package BenchChallenges.February14;

public class Memory {
    public static String actualMemorySize(String input){
        String memorySize = input.substring(0, input.length()-2);
        double number = Double.parseDouble(memorySize);
        number = number*0.93;
        StringBuilder sb = new StringBuilder();
        if(input.charAt(input.length()-2) == 'M'){
            // Using 1024 for binary. Simply change 1024 to 1000 for decimal.
            if(number > 1024){
                number /= 1024;
                sb.append(roundTwo(number)).append("GB");
            } else {
                sb.append((int) number).append("MB");
            }
        }
        else if(number < 1.0){
            // Using 1024 for binary. Simply change 1024 to 1000 for decimal.
            number = number*1024;
            sb.append((int) number).append("MB");
        }
        else {
            sb.append(roundTwo(number)).append("GB");
        }
        
        return sb.toString();
    }

    public static double roundTwo(double in){
        double temp = in * 1000;
        temp = Math.round(temp);
        return temp/1000;
    }

    public static void main(String[] args) {

        // Tests provided

        System.out.println("actualMemorySize(\"32GB\") --> " + actualMemorySize("32GB"));
        System.out.println("actualMemorySize(\"2GB\") --> " + actualMemorySize("2GB"));
        System.out.println("actualMemorySize(\"512MB\") --> " + actualMemorySize("512MB"));

        // Additional Tests

        // same as 2GB, testing return in GB from MB if more than 1GB
        System.out.println("actualMemorySize(\"2048MB\") --> " + actualMemorySize("2048MB")); 
        // Same as 512MB, testing return in MB from GB if less than 1GB
        System.out.println("actualMemorySize(\"0.5GB\") --> " + actualMemorySize("0.5GB")); 

    }
}
