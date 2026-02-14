// Sliding window minimum

import java.util.Deque;
import java.util.LinkedList;

class java10 {
    public static void main (String[] args) {
        int[] arr = {1, 0, 4, 6, 3, 1, 6, 7, 3, 9, 0};
        int n = arr.length;
        int k = 3;

        Deque<Integer> d = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            if (!d.isEmpty() && d.peekFirst() <= i - k ) {
                d.pollFirst();
            }

            while (!d.isEmpty() && arr[d.peekLast()] >= arr[i]) {
                d.pollLast();
            }

            d.offerLast(i);

            if (i >= k - 1) {
                System.out.println(arr[d.peekFirst()]);
            }
        }

    }
}