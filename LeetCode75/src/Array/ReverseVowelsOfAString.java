package Array;

import java.util.ArrayDeque;

public class ReverseVowelsOfAString {
    class Solution {
        public String reverseVowels(String s) {
            char[] q = s.toCharArray();
            ArrayDeque<Integer> swapInd = new ArrayDeque<>();
            int numOfswaps = 0;
            int numOfVowels = 0;
            int iter = 0;

            for (char c : q) {
                if (isVowel(c)) {
                    numOfVowels++;
                    swapInd.add(iter);
                }
                iter++;
            }

            numOfswaps = Math.floorDiv(numOfVowels, 2);

            for (int i = 0; i < numOfswaps; i++) {
                int first = swapInd.getFirst();
                int last = swapInd.getLast();

                swap(first, last, q);

                swapInd.removeFirst();
                swapInd.removeLast();
            }

            return new String(q);
        }

        private void swap(int first, int last, char[] q) {
            char temp = q[last];
            q[last] = q[first];
            q[first] = temp;
        }

        private boolean isVowel(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U';
        }
    }
}
