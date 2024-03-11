import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers of the Array: ");
        int[] arr = new int[size];
        for(int i=0; i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to find from  the Array: ");
        int search = sc.nextInt();
        for(int i=0; i<=size; i++)
        {
            if(arr[i] == search)
            {
                System.out.println("The index of the number " +search+ " is " +i);
                break;
            }
            else{
                System.out.println("-1");
                break;
            }
        }
    }
}
