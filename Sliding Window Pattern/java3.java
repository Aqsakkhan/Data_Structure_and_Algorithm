// Count anagrams of a string
import java.util.HashMap;

class java3 {
    public static void main(String[] args) {

        String str = "cbaebabacd";
        String pat = "abc";

        HashMap<Character, Integer> map = new HashMap<>();

        // 1️⃣ Build frequency map of pattern
        for (char ch : pat.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = map.size();   // number of unique characters
        int k = pat.length();
        int start = 0;
        int ans = 0;

        // 2️⃣ Sliding window
        for (int end = 0; end < str.length(); end++) {

            char endChar = str.charAt(end);

            // character enters window
            if (map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);
                if (map.get(endChar) == 0) {
                    count--;
                }
            }

            // when window size equals pattern length
            if (end - start + 1 == k) {

                // check if anagram
                if (count == 0) {
                    ans++;
                }

                // character leaves window
                char startChar = str.charAt(start);
                if (map.containsKey(startChar)) {
                    if (map.get(startChar) == 0) {
                        count++;
                    }
                    map.put(startChar, map.get(startChar) + 1);
                }

                start++;
            }
        }

        System.out.println("Anagram count: " + ans);
    }
}
