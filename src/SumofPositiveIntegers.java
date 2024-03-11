import java.util.Scanner;
public class SumofPositiveIntegers {
    public static  void main(String[] args)
    {
        int[] a = {5, 3, 2, -4, 3, 2};
        int sum = 0;
        int count = a.length;
        System.out.println("Length of Array: " +count);
        for(int i=0;i<count;i++)
        {
            sum = sum + a[i];
            if(a[i]<0)
            {
                System.out.println("Sum of Positive Integers: " +sum);
                break;
            }
        }
    }
}
