package KiemTra;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class _506_Relative_Ranks {
    public static void main(String[] args) {
        int []score={5,4,3,2,1};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }


    public static String[] findRelativeRanks(int[] score) {
        ArrayList<Integer> scores = new ArrayList<>();
        
        for(int i: score)
            scores.add(i);
        
        Collections.sort(scores);
        Collections.reverse(scores);
        
        HashMap<Integer, Integer> athletes = new HashMap<>();
        
        for(int i=0; i<scores.size(); i++)
        athletes.put(scores.get(i), i+1);
        
        String[] ranks = new String[scores.size()];
        
        for(int i=0; i<score.length; i++){
            int index = athletes.get(score[i]);
            
            if(index == 1){
                ranks[i] = "Gold Medal";
            }
            else if(index == 2){
                ranks[i] = "Silver Medal";
            }
            else if(index == 3){
                ranks[i] = "Bronze Medal";
            }
            else{
                ranks[i] = Integer.toString(index);
            }
        }
        return ranks;
    }
}
