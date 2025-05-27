package Array;

public class ProductOfArrayExceptSelf {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int totalProduct = 1;
            int totalProductZ = 1;
            int zeroCount = 0;
            int[] output = new int[nums.length];

            for (Integer i : nums) {
                totalProduct *= i;

                if (i != 0) {
                    totalProductZ *= i;
                }

                if (i == 0) {
                    zeroCount++;
                }
            }

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    output[i] = totalProduct / nums[i];
                } else if (zeroCount == 1) {
                    output[i] = totalProductZ;
                }
            }

            return output;
        }
    }
}



