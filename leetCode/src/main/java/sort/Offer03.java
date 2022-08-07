package sort;

import java.util.HashSet;
import java.util.Set;

public class Offer03 {
    public int findRepeatNumber1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if (nums[j]==nums[nums.length-i-1]) return nums[j];
            }
        }
        return -1;
    }

    public int findRepeatNumber2(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int repeat=-1;
        for (Integer num : nums) {
            if (!set.add(num)){
                repeat=num;
            }
        }
        return repeat;
    }
    public int findRepeatNumber3(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i) {
                i++;
                continue;
            }
            if(nums[nums[i]] == nums[i]) return nums[i];
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;

    }
}
