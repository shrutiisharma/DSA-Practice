//Sort an array of 0s, 1s and 2s

package Arrays;

// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// { Driver Code Starts
//Initial template for Java


// } Driver Code Ends
//User function template for Java

class P04
{
    public static void sort012(int a[], int n)
    {
        Arrays.sort(a);
    }
}

// { Driver Code Starts.

class GFG {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            P04 ob=new P04();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

// } Driver Code Ends