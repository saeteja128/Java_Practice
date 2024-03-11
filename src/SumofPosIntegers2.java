import java.util.Scanner;
public class SumofPosIntegers2 {
    public static void main(String[] args)
    {
        int sum = 0;
        int num;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the Integers: ");
            num = sc.nextInt();
            sum = sum + num;
            System.out.println("Sum of Positive Integers: " +sum);
        }while(num>=0);
    }
}
