public class TwoIntegerSum {
    public static void main(String[] args) {
        /*
        Given an array of integers nums and an integer target,
        return the indices i and j such that nums[i] + nums[j] == target and i != j.

        You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
        Return the answer with the smaller index first.

        Input:
        nums = [3,4,5,6], target = 7

        Output: [0,1]

         */

        int[] nums = {3, 4, 5, 6};
        int target = 7;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <nums.length; i++) {
                System.out.println(nums[i] + " " + nums[2]);
            }
        }
    }
}
