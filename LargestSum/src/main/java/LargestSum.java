
import java.util.Collections;
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        Collections.sort(nums);
        int largeNum1 = nums.get(0);
        int largeNum2 = nums.get(0);
        int largestSum =0;

        for (int i=0; i<nums.size(); i++){
            if (nums.get(i) > largeNum1){
                largeNum1 = nums.get(i);
                largeNum2 = nums.get(i-1);
                if (largeNum1 == nums.get(nums.size()-2)){
                    largeNum2 = nums.get(nums.size()-2);
                }
            }
            largestSum = largeNum1 + largeNum2;

        }
        return largestSum;
    }
}