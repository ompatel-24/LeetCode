import java.util.ArrayList;

public class StringCompression {
  class Solution {
    public int compress(char[] chars) {
      if (chars.length == 1) { return 1; }

      ArrayList<Character> output = new ArrayList<Character>();
      char past;
      int count = 0;
      past = chars[0];

      for (Character c : chars) {
        if (past == c) {
          count++;
        } else {
          output.add(past);
          output.add((char) count);

          count = 0;
        }

        past = c;
      }

      for (int i = 0; i < output.size() - 1; i++) {
        chars[i] = output.get(i);
      }

      return output.size();
    }
  }
}

public void main(String[] args) {
  StringCompression sc = new StringCompression();
  StringCompression.Solution solution = sc.new Solution();

  char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
  int length = solution.compress(chars);

  System.out.println("Compressed length: " + length);
  System.out.print("Compressed chars: ");
  for (int i = 0; i < length; i++) {
    System.out.print(chars[i] + " ");
  }
}
