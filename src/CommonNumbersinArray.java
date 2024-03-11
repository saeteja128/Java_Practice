import java.util.Scanner;
public class CommonNumbersinArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of First Array: ");
        int size1 = sc.nextInt();
        System.out.println("Enter the size of Second Array: ");
        int size2 = sc.nextInt();
        int[] A = new int[size1];
        int[] B = new int[size2];
        int count=0;
        System.out.println("Enter the elements of First Array: ");
        for(int i=0; i<size1; i++)
        {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of Second Array: ");
        for(int i=0; i<size2; i++)
        {
            B[i] = sc.nextInt();
        }
        for(int i=0; i<size1;i++)
        {
            for(int j=0; j<size2;j++)
            {
                if(A[i]==B[j])
                {
                    count++;
                    int pos =0;
                    int[] res = new int[count];
                    res[pos] = A[i];
                    pos++;
                    for(int k=0; k<res.length;k++)
                    {
                        System.out.println("Common numbers in two arrays: " +res[k]);
                        break;
                    }
                }
            }
        }
    }
}
