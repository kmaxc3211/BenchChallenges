package BenchChallenges.FebuaryFirst;

import java.util.ArrayList;
import java.util.Iterator;

public class ProblemOne {

    public static ArrayList<Integer> filterArray(Object[] array) {
        ArrayList<Integer> out = new ArrayList<Integer>();

        for(int i = 0; i < array.length; i++){
            if (array[i].getClass() == Integer.class){
                Iterator<Integer> it = out.iterator();
                boolean add = true;
                while(it.hasNext()){
                    if(it.next() == array[i])
                        add = false;
                }
                if(add)
                    out.add((Integer)array[i]);
            }
        }

        return out;
    }

    public static void main(String[] args) {
        System.out.println(filterArray(new Object[] {1, 2, "a", "b"}));
        System.out.println(filterArray(new Object[] {1, "a", "b", 0, 15}));
        System.out.println(filterArray(new Object[] {1, 2, "aasf", "1", "123", 123}));
        System.out.println(filterArray(new Object[] {1, 5, "55", 1, "sdf", 1, "1", 2}));
    }

}
