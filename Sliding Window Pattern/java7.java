// Sliding window maximum  

class java7 {
    public static void main (String[] args) {
        int[] arr = {1, 4, 6, 3, 0, 3, 1, 3};
        int n = arr.length;
        int k = 3;

        int maxElement = 0;
        for (int i = 0; i < k; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        System.out.println(maxElement);

        for (int i = k; i < n; i++) {
            int incoming = arr[i];
            int outgoing = arr[i - k];

            if (outgoing == maxElement) {
                maxElement = arr[i - k + 1];
                for (int j = (i - k + 1); j < i; j++) {
                    if (arr[j] > maxElement) {
                        maxElement = arr[j];
                    }
                }
                System.out.println(maxElement);
            } else if (incoming > maxElement) {
                maxElement = incoming;
                System.out.println(maxElement);
            } else {
                System.out.println(maxElement);
            }
        }
    }
}