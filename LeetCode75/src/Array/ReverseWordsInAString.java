package Array;

import java.util.ArrayDeque;

public class ReverseWordsInAString {
    class Solution {
        public String reverseWords(String s) {
            char[] q = s.toCharArray();
            ArrayDeque<String> words = new ArrayDeque<>();
            StringBuilder word = new StringBuilder();
            int iter = 0;
            for (char c: q) {
                if (c != ' ') {
                    word.append(c);
                } else if (!word.isEmpty()) {
                    words.addFirst(String.valueOf(word));
                    word = new StringBuilder();
                }

                if (iter == q.length - 1) {
                    words.addFirst(String.valueOf(word));
                }

                iter++;
            }

            StringBuilder out = new StringBuilder();
            for (String w: words) {
                out.append(w);
                out.append(" ");
            }

            return out.toString().trim();
        }
    }
}
