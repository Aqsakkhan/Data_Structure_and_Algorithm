// Longest substring without repeating characters
import java.util.HashMap;

class java4 {
    public static void main (String[] args) {
        int[] arr = {1, 4, 1, 5, 4, 6, 3, 4, 2, 8, 4};
        int n = arr.length;

        int start = 0;
        int maxLen = 0;
        int maxStart = 0;
        HashMap<Integer, Integer> num = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (num.containsKey(arr[i])) {
                start = num.get(arr[i]) + 1;
            }
            num.put(arr[i], i);

            int len = i - start + 1;
            if (len > maxLen) {
                maxLen = len;
                maxStart = start;
            }
        }
        System.out.println("Longest sub-array length : " + maxLen);
        System.out.println("Longest sub-array : " );
        for (int i = maxStart; i < (maxStart + maxLen); i++) {
            System.out.print(arr[i] + " ");
        }
    }
}