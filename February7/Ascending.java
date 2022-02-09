package BenchChallenges.February7;

public class Ascending {

    public static boolean ascending(String input) {
        if(input.length() < 2){
            return false;
        }

        int limit = 1;
        do {
            int integer = Integer.parseInt(input.substring(0, limit));
            
            StringBuilder sb = new StringBuilder();
            while(sb.toString().length() < input.length()){
                sb.append(integer++);
            }
            if(sb.toString().equals(input))
                return true;
            else{
                limit++;
            }
        } while (limit<=input.length()/2);
        
        return false;
    }

    public static void main(String[] args) {
        System.out.println( ascending("232425") );
        System.out.println( ascending("2324256") );
        System.out.println( ascending("444445") );
        System.out.println( ascending("99100101102") );
    }
    
}
