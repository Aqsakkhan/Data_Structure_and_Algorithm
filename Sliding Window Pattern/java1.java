 //Maximum sum subarray of size K
import java.util.ArrayList;
import java.util.List;
class java1 {
    public static void main(String[] args) {
        int[] array = {1, 0, 7, 0, 3, 2, 1, 7};
        int n = array.length;
        int k = 3; //window size
        
        int start = 0;
        int end = 0;
        // Empty list for maxSubarray
        List<Integer> maxSubarray = new ArrayList<>();
        
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += array[i];
        }
        
        int maxSum = sum;
        
        for (int i = k; i < n; i++) {
            sum = sum - array[i - k] + array[i];
            if (sum > maxSum) {
                maxSum = sum;
                start = i - k + 1;
                end = i;
            }
        }
        
        for (int i = start; i <= end; i++) {
            maxSubarray.add(array[i]);
        }
        System.out.println("Max Sum Subarray: " + maxSubarray);
        System.out.println("Max Sum: " + maxSum);
    }
}