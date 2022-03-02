//Trailing zeroes in factorial

package Mathematics;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int ans = trailingZeroes(n);
        System.out.println(ans);
    }

    private static int trailingZeroes(int n) {
        if (n < 0)
            return -1;

        int count = 0;
        for (int i = 5; n/i >= 1 ; i *= 5)
            count += n/i;

        return count;
    }
}
