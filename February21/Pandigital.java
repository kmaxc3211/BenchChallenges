package BenchChallenges.February21;

public class Pandigital {

    public static int largestPandigital(){
        
        int largest = 0;

        // Only going to 10000, because then it will go to 10 digits. there are some earlier in the 9000s, but this does the trick.
        for(int i = 1; i < 10000; i++){

            StringBuilder sb = new StringBuilder();
            sb.append(i);
            // Build the pandigital as a string first for easier concatenation and length checking
            for(int j = 2; j < 10; j++){
                sb.append(i*j);
                if(sb.toString().length() >= 9)
                    break;                
            }

            String pandigitalString = sb.toString();
            
            // Check if greater than 9 digits
            if(pandigitalString.length() > 9)
                continue;

            // Check if all 9 digits are present. Ascii values for chars '1' through '9' are 49 through 57
            boolean hasAll = true;

            for(int k = 49; k < 58; k++){
                if(pandigitalString.indexOf(k) < 0){
                    hasAll = false;
                    break;
                }
            }
            
            // If not all 9 separate digits are present, move on.
            if(!hasAll)
                continue;
            
            if(Integer.parseInt(pandigitalString) > largest)
                largest = Integer.parseInt(pandigitalString);
        }

        return largest;
    }

    public static void main(String[] args) {
        System.out.println(largestPandigital());
        // The output here is 932718654. Not sure if this is it, but based on the logic used I believe it is.
    }
    
}
