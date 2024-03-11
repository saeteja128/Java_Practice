import java.util.Scanner;
public class forLoop {
    public static void main(String[] args) {
        System.out.println("Enter the value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("1");
        for(int i = 2; i <= n; i++)
        {
            System.out.print(" "+i);
        }
    }
}
