import java.util.Scanner;
public class SumofNaturalNumbers {
    public static void main(String[] args)
    {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=N;i++)
        {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
