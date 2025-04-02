package MoveZeroes;

import java.util.Arrays;

public class Solution{
    public static void main(String[]args){
        int[]nums = {0,1,2,0,13};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
        public static int[] moveZeroes(int[] nums) {
            int left = 0;
            int countOfZero = 0;

            for (int i= 0; i < nums.length; i++) {
                // counting zeros
                if (nums[i] == 0) {
                    countOfZero ++;
                    continue;
                }
                // shift non-zeros to start of array
                nums[left] = nums[i];
                left ++;
            }
            // write zeros at the end of array
            while ((left < nums.length) && (countOfZero > 0)) {
                nums[left] = 0;
                left ++;
                countOfZero --;
            }

            return nums;
        }
    }
