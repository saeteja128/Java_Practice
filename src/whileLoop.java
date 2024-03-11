import java.util.Scanner;
public class whileLoop {
    public static void main(String [] args)
    {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int i=1;
        int n = sc.nextInt();
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
    }
}
