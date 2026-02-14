// First negative number in every window of size K
import java.util.Queue;
import java.util.LinkedList;
class java2 {
    public static void main (String[] args) {
        int[] arr = {1, 4, -6, 7, -4, 5, 9, 8};
        int n = arr.length;
        int k = 3;

        Queue<Integer> q = new LinkedList<>();
        int start = 0;

        for (int i = 0; i < n; i++) {
            // Add negative number in queue
            if (arr[i] < 0) {
                q.add(i);
            }

            // Check if window is complete acc to size
            if ((i - start + 1) == k) {

                if (q.isEmpty()) {
                    System.out.println("0 ");
                } else {
                    System.out.println(arr[q.peek()] + " ");
                }

                // Remove negative number from queue if outside the window size
                if (!q.isEmpty() && q.peek() == start) {
                    q.poll(); // It will remove first element of queue
                }

                start++;
            }


        }

         
    }
}