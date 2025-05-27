package Array;

public class DivideTwoIntegers {
    class Solution {
        public int divide(int dividend, int divisor) {
            boolean nig = (dividend < 0) ^ (divisor < 0);

            long dividend1 = Math.abs(dividend);
            long divisor1 = Math.abs(divisor);
            long count = 0;

            if (divisor1 == 1) {
                count = dividend1;
            } else {
                while (dividend1 >= divisor1) {
                    dividend1 -= divisor1;
                    count++;
                }
            }

            if (nig) {
                count = -count;
            }

            if (count > Math.pow(2, 31) - 1) {
                return (int) Math.pow(2, 31) - 1;
            }

            if (count < Math.pow(-2, 31)) {
                return (int) Math.pow(-2, 31) - 1;
            }

            return (int) count;
        }
    }

}
