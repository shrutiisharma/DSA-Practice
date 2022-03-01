//Minimum steps to make product equal to one

package Mathematics;

import java.util.Scanner;

class P02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int ans = makeProductOne(arr, n);
        System.out.println(ans);
    }

    private static int makeProductOne(int[] arr, int n) {
        int steps = 0;
        int negCount = 0, zeroCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0){
                steps += (arr[i] - 1);
            }
            else if (arr[i] < 0){
                steps += (-1 * (arr[i] - (-1)));
                negCount++;
            }
            else
                zeroCount++;
        }
        if (negCount % 2 == 0){
            steps += zeroCount;
        }
        else{
            if (zeroCount > 0)
                steps += zeroCount;

            else
                steps += 2;
        }

        return steps;
    }
}