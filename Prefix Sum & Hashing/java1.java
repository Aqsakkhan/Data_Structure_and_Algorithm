// Sub-array sum equals K

import java.util.HashMap;

class java1 {
    public static void main (String[] args) {
        int[] arr = {1, 5, 6, 4, 7, 4, 3, 7, 1};
        int n = arr.length;
        int k = 11;
      
        HashMap<Integer, Integer> map = new HashMap<>();


        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }

        System.out.print("Number of sub-array : " + count);


    }
}