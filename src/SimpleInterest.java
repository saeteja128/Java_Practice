import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Principle Amount: ");
        int principle = sc.nextInt();
        System.out.println("Enter the value of Rate of Interest: ");
        int roi = sc.nextInt();
        System.out.println("Enter the value of Time : ");
        int time = sc.nextInt();
        int SimpleInterest = (principle*roi*time)/100;
        System.out.println("Calculated Simple Interet: "+SimpleInterest);
    }
}
