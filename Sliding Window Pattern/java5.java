class java5 {
    public static void main (String[] args) {

        int[] arr = {1, 2, 3, 2, 5, 6, 3, 5, 3, 6, 1, 4, 7};
        int n = arr.length;
        int k = 4; // For distinct character

        HashMap<Integer, Integer> map = new HashMap<>();
        int start = 0;
        int maxLen = 0;
        int maxStart = 0;

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            while (map.size() > k) {
                map.put(arr[start], map.get(arr[start]) - 1);

                if (map.get(arr[start]) == 0) {
                    map.remove(arr[start]);
                }

                start++;
            }
            
            int len = i - start + 1;
            if (len > maxLen) {
                maxLen = len;
                maxStart = start;
            }

        }
        System.out.print(maxLen);
        System.out.println("Longest sub-array : " );
        for (int i = maxStart; i < (maxStart + maxLen); i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
