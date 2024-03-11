import java.util.Scanner;
public class SmallestOfNumbers {
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minValue = Integer.MAX_VALUE;

        System.out.println("Enter the current value: ");
        for(int i=0;i<n;i++)
        {
            sc.useDelimiter("[\\s,]+");
            int current = sc.nextInt();
            minValue = Math.min(minValue, current);
        }

        System.out.println("Smallest Value of all numbers: "+minValue);
    }
}
