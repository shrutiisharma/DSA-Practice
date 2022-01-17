//Maximum Index

package Arrays;

import java.util.Scanner;

class P07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int ans = maxIndexDiff(arr, n);
        System.out.println(ans);
    }

    private static int maxIndexDiff(int A[], int N) {

        int k = 0;
        if (N > 1) {
            for (int i = 0; i < N; i++) {
                for (int j = N - 1; j > i; j--) {
                    if (A[i] <= A[j] && k < (j - i))  k = j - i;
                }
            }
        }
        return k;
    }
}




