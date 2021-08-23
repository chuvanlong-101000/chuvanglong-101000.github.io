package HackAthon;

public class _1512_Number_of_Good_Pairs {
    public static void main(String[] args) {

        int [] nums = {1, 1, 2, 3, 4, 3, 6, 7, 8, 9};
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {        
        int count=0;
        for (int i = 0 ; i < nums.length-1 ; i++) {
            for (int j = i + 1 ; j < nums.length ; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count += 1;                       
                }
            }
        }
        return count;
    }
}
