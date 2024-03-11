import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers of Array: ");
        int[] a = new int[size];
        for(int i=0; i<size;i++){
            a[i] = sc.nextInt();
        }
        int count =0, pos=0;
        int[] rev = new int[size];
        for(int j=size-1;j>=0;--j){
            rev[pos] = a[j];
            pos++;
        }
        System.out.println("Array after reversing: ");
        for(int k=0; k<rev.length;k++)
        {
            System.out.println("Array value at index " +k+ " is " +rev[k]);
        }

    }

}
