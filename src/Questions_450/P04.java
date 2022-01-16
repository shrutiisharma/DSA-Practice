//Kth smallest element

package Questions_450;

// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class P04 {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t=sc.nextInt();

        while(t-->0)
        {
            int n=sc.nextInt();

            int arr[]=new int[n];

            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            int k=sc.nextInt();
            Solution ob = new Solution();
            out.println(ob.kthSmallest(arr, 0, n-1, k));
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) {

        Arrays.sort(arr);
        return arr[k-1];
        /*for (int i = 0; i < r + 1; i++) {
            for (int j = i + 1; j < r + 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if ((i+1) == k)
                return arr[i];
        }
        return 0;*/
    }
}

