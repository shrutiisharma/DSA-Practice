//Middle of Three

package Arrays;

import java.io.*;

class P06 {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int A=Integer.parseInt(S[0]);
            int B=Integer.parseInt(S[1]);
            int C=Integer.parseInt(S[2]);
            Sol ob = new Sol();
            System.out.println(ob.middle(A,B,C));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Sol{
    int middle(int A, int B, int C){
        if ((A>B && A<C) || (A<B && A>C)) return A;
        else if ((B>A && B<C) || (B<A && B>C)) return B;
        else return C;
    }
}