import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int highest = 0;
            for (int i = 0; i < candies.length; i++) {
                highest = Math.max(highest, candies[i]);
            }

            List<Boolean> out = new ArrayList<>();
            for (int i = 0; i < candies.length; i++) {
                out.add(candies[i] + extraCandies >= highest);
            }

            return out;
        }
    }
}
