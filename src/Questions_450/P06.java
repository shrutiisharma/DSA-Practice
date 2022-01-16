//Move all negative numbers to beginning and positive to end with constant extra space

package Questions_450;

import java.util.Arrays;
import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] solArr = solutionArray(arr);
        System.out.println(Arrays.toString(solArr));
    }

    private static int[] solutionArray(int[] arr) {

        //METHOD1
        int k  = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                if (i != k){
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
                k++;
            }
        }

        /*
        //METHOD2
        int start = 0, end = arr.length - 1;
        while(start <= end) {

            //s>0 e>0
            if ((arr[start] > 0) && (arr[end] > 0)) {
                end--;
            }

            //s>0 e<0
            else if ((arr[start] > 0) && (arr[end] < 0)) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }

            //s<0 e<0
            else if ((arr[start] < 0) && (arr[end] < 0)) {
                start++;
            }

            //s<0 e>0
            else {
                start++;
                end--;
            }
        }
        */

        return arr;
    }
}
