public class ContainsDuplicate {
    public static void main(String[] args) {
        /*
        Given an integer array nums,
        return true if any value appears more than once in the array,
        otherwise return false.
         */


        int[] nums = {1, 2, 3, 3};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    System.out.println("True");
                    System.out.println("i:" + i + " j:" + j);
                    System.out.println("i:[" + nums[i] + "] j:[" + nums[j] + "]");
                    break;
                }
            }
        }
        System.out.println("False");

    }
}
