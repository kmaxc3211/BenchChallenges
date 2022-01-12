package BenchChallenges.BishopChallenge;

public class Chess {
    public static boolean bishop(String start, String end, int moves) {
        if(start.equals(end))
            return true;
        int letter = Math.abs(start.charAt(0) - end.charAt(0));
        int number = Math.abs(start.charAt(1) - end.charAt(1)); 
        if(letter == number && moves >= 1)
            return true;
        boolean letterTrue = false;
        boolean numberTrue = false;
        if( (letter & 1) == 0 ) 
            letterTrue = true;
        if( (number & 1) == 0 ) 
            numberTrue = true;
        if(numberTrue && letterTrue && moves >= 2)
            return true;
        if(!numberTrue && !letterTrue && moves >= 2)
            return true;    
        return false;
    }

    public static void main(String[] args) {
        System.out.println("A1 to B4 in 2 moves: " + bishop("a1", "b4", 2));
        System.out.println("A1 to B4 in 1 moves: " + bishop("a1", "b4", 1));
        System.out.println("C5 to G1 in 1 move: " + bishop("c5", "g1", 1));
        System.out.println("D4 to B5 in 100 moves: " + bishop("d4", "b5", 100));
        System.out.println("F3 to F3 in 0 moves: " + bishop("f3", "f3", 0));
    }
}
