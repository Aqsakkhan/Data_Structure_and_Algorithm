// Smallest subarray with sum ≥ K

class java6 {
    public static void main (String[] args) {
        int[] arr = {2, 1, 5, 2, 3, 1, 2};
        int n = arr.length;
        int k = 4;

        int start = 0;
        int minLen = Integer.MAX_VALUE;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            
            while (sum >= k) {
                int len = i - start + 1;
                minLen = minLen > len ? len : minLen;
                sum -= arr[start];
                start++;
            }
        }
        System.out.println(minLen);
    }
}