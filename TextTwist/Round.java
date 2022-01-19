package BenchChallenges.TextTwist;

import java.util.Arrays;

public class Round {

    public static int totalPoints(String[] guessed, String word){
        int[] mainWordCount = new int[26];
        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++){
            ++mainWordCount[(word.charAt(i) - 97)];
        }
        int points = 0;

        for (String s : guessed) {
            if(s.length() < 3)
                continue;
            int[] guessCount = new int[26];
            s = s.toLowerCase();
            for(int i = 0; i < s.length(); i++){
                ++guessCount[(s.charAt(i) - 97)];
            }

            if(Arrays.equals(guessCount, mainWordCount)) {
                points += 50;
                points += (s.length() - 2);
                continue;
            }

            boolean valid = true;
            for(int j = 0; j < 26; j++){
                if(mainWordCount[j] < guessCount[j]){
                    valid = false;
                    continue;
                }
            }
            if(valid)
                points += s.length()-2;
        }

        return points;
    }

    public static void main(String[] args) {

        String[] words1 = {"cat", "create", "sat"};
        System.out.println(totalPoints(words1, "caster"));

        String[] words2 = {"trance", "recant"};
        System.out.println(totalPoints(words2, "recant"));

        String[] words3 = {"dote", "dotes", "toes", "set", "dot", "dots", "sted"};
        System.out.println(totalPoints(words3, "tossed"));
        
    }
}
