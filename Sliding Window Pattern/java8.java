// Sliding window maximum  
import java.util.Deque;
import java.util.LinkedList;

class java8 {
    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 3, 0, 3, 1, 3};
        int n = arr.length;
        int k = 3;

        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            // Remove element from front if outside the window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove element from rear
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            // Add array index inside deque list
            dq.offerLast(i);

            // Print if window completed
            if (i >= k - 1) {
                System.out.println(arr[dq.peekFirst()]);
            }
        }
    }
}
 