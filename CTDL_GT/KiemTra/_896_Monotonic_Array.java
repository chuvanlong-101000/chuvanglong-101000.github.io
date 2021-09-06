package KiemTra;

public class _896_Monotonic_Array {
    public static void main(String[] args) {
        //int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //System.out.println(isMonotonic(nums));
        int[] A = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(isMonotonic(A));
    }

    public static boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] > nums[i+1])
                increasing = false;
            if (nums[i] < nums[i+1])
                decreasing = false;
        }
        return increasing || decreasing;
    }
}
