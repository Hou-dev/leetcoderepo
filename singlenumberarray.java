
// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.
import java.util.Arrays;

public class singlenumberarray {
    public int singleNumber(int[] nums) {
        int counter = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                }
            }
            if (counter == 2) {
                counter = 0;
                continue;
            }
            if (counter == 1) {
                return (nums[i]);
            }
        }
        return 0;
    }
}
