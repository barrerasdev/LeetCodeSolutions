package TwoSum;
// Just for toString, not on LeetCode
import java.util.Arrays;
class Solution {

    //My own Test Case and Print
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    //LeetCode Problem
    public static int[] twoSum(int[] nums, int target) {
        //Int n is 4 long in this case
        int n = nums.length;
        //First for loop starts at (2), runs until second to last number
        //We don't need to compare the last index, since we are using...
        for ( int i = 0 ; i < n - 1 ; i++ ){
            //Another loop to check in reverse, which starts at (15) and will run
            //until the two indexes meet (15, 11, and 7 were checked, i = 0, j = 1).
            for ( int j = n - 1 ; j > i ; j--){
                //Simple conditional to check target
                if (nums[i] + nums[j] == target){
                    //Return pair of indexes as new array
                    return new int[]{i,j};
                }
            }
        }
        //None add up to target, no solution
        return new int[]{};
    }
}