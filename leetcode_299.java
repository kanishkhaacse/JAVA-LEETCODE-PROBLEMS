import java.util.*;
class Solution {
    public String getHint(String secret, String guess)
    {
        int bull = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int n=secret.length();
        for (int i = 0; i < n; i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if (s == g) {
                bull++;
            } else {
                map.put(g, map.getOrDefault(g, 0) + 1);
            }
        }
        int cow = 0;
        for (int i = 0; i < n; i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if (s != g && map.getOrDefault(s, 0) > 0) {
                cow++;
                map.put(s, map.get(s) - 1);
            }
        }

         return bull + "A" + cow + "B";
    }
}