import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int low = 0, high = 0;
        int maxlen = 0;

        for (high = 0; high < s.length(); high++) {

            char ch = s.charAt(high);

            // Add high character to the map
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } 
            else {
                map.put(ch, 1);
            }

            // Window is invalid if any character occurs more than once
            while (map.get(ch) > 1) {

                char leftChar = s.charAt(low);

                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                low++;
            }

            // Now the window has no duplicate characters
            int len = high - low + 1;

            maxlen = Math.max(maxlen, len);
        }

        return maxlen;
    }
}