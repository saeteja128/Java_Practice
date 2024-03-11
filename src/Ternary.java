import java.util.Scanner;
public class Ternary {
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String answer = (n%2==0) ? "Number is Even" : "Number is Odd";
        System.out.println(answer);
    }
}
