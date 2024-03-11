import java.util.Scanner;

public class Positive_Negative {
    public  static void main(String[] args)
    {
        System.out.println("Enter the value of the Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0)
        {
            System.out.println("The given number " +n+ " is Positive");
        }
        else {
            System.out.println("The given number " +n+ " is Negative");
        }
    }
}
