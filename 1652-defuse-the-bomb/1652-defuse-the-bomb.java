class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int[] result = new int[n];

        if (k == 0) {
            return result;
        }

        if (k > 0) {

            int sum = 0;

            // Initial window: elements after index 0
            for (int j = 1; j <= k; j++) {
                sum += code[j % n];
            }

            int low = 1;
            int high = k;

            for (int i = 0; i < n; i++) {

                result[i] = sum;

                // Slide window
                sum -= code[low % n];
                high++;
                sum += code[high % n];
                low++;
            }
        }

        else {

            int sum = 0;

            // Initial window: previous |k| elements
            for (int j = 1; j <= -k; j++) {
                sum += code[(n - j) % n];
            }

            int low = n - (-k);
            int high = n - 1;

            for (int i = 0; i < n; i++) {

                result[i] = sum;

                sum -= code[low % n];
                high++;
                sum += code[high % n];
                low++;
            }
        }

        return result;
    }
}