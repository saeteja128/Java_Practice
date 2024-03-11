import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
//        System.out.println("Min Value: " +minValue);
        System.out.println("Enter the Array Numbers: ");
        for(int i=0; i<size;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int j=0;j<size;j++)
        {
            minValue = Math.min(minValue, a[j]);
        }
        System.out.println("Min Value in Array is: " +minValue);
        for(int k=0;k<size;k++)
        {
            maxValue = Math.max(maxValue, a[k]);
        }
        System.out.println("Max Value in Array is: " +maxValue);
    }
}
