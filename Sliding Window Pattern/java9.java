// Longest repeating character replacement
import java.util.HashMap;
// import java.util.Math;
class java9 {
    public static void main (String[] args) {
        String str = "AABAACAEF";
        int n = str.length();
        int k = 2;

        HashMap<Character, Integer> map = new HashMap<>();

        int start = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(ch));

            int windowSize = i - start + 1;
            if (windowSize - maxFreq > k) {
                char leftChar = str.charAt(start);
                map.put(leftChar, map.get(leftChar) - 1);
                start++;
            }

            maxLen = Math.max(maxLen, i - start + 1);
            
        }

        System.out.print(maxLen);
    }
}