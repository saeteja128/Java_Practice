import java.util.Scanner;
public class SquaresofNaturalNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i=0; i<size;i++)
        {
            a[i] = i+1;
            System.out.println("Value of array at the index " +i+ " is: " +a[i] );
        }
        int count = a.length;
        System.out.println(" ");
        for(int i=0; i<count;i++)
        {
            a[i] = a[i]*a[i];
            System.out.println("Squares value at index " +i+ " is " +a[i]);
        }
    }
}
