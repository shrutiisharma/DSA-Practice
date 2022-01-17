//REVERSE A STRING

package String;// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.lang.*;

class P01
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        //method 1
        char ch;
        String revStr = "";

        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            revStr = ch + revStr;
        }

        return revStr;

        /*
        //method 2
        StringBuilder revStr = new StringBuilder();
        revStr.append(str);
        revStr.reverse();
        return String.valueOf(revStr);
         */
    }
}