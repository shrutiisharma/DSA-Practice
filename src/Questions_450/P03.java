//Maximum and minimum of an array

package Questions_450;

import java.util.Scanner;

public class P03 {
    static int max;
    static int min;
    static int[] a;
    static void maxmin(int i, int j)
    {
        int max1, min1, mid;
        if(i == j)
            max = min = a[i];

        else
        {
            if(i == j-1)
            {
                if(a[i] < a[j])
                {
                    max = a[j];
                    min = a[i];
                }
                else
                {
                    max = a[i];
                    min = a[j];
                }
            }
            else
            {
                mid = (i+j)/2;
                maxmin(i, mid);
                max1 = max;
                min1 = min;
                maxmin(mid+1, j);
                if(max < max1)
                    max = max1;
                if(min > min1)
                    min = min1;
            }
        }
    }

    public static void main(String[] args) {
        int i, num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total number of numbers : ");
        num = in.nextInt();

        a = new int[num];
        System.out.println("Enter the numbers:");

        for (i = 0; i < num; i++){
            a[i] = in.nextInt();
        }
        max = a[0];
        min = a[0];
        maxmin(1, num-1);

        System.out.println("Minimum element in an array : " + min);
        System.out.println("Maximum element in an array : " + max);
    }
}
