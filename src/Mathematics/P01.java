//Missing number in array

package Mathematics;

import java.util.Scanner;

class P01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = in.nextInt();
        int[] arr = new int[n-1];

        for (int i = 0; i < n-1; i++) {
            arr[i] = in.nextInt();
        }
        int ans = missingNumber(arr, n);
        System.out.println(ans);
    }

    private static int missingNumber(int[] arr, int n) {
        int sum = ((n * (n + 1)) / 2);
        int total = 0;
        for (int i = 0; i < n-1; i++) {
            total += arr[i];
        }
        return sum - total;
    }
}