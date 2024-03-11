import java.util.Scanner;
public class SquareOfNumber {
    static int Square(int number)
    {
        return number*number;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Square of number: " +Square(n));
    }


}
