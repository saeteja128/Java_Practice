import java.util.Scanner;
public class LogicalAnd {
    public static void main(String[] args){
        System.out.println("Enter the Age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Enter the Citizenship: ");
        String citizenship = sc.next();
        String VoteRight = (age>=18 && citizenship.equals("India")) ? "Eligible for Vote" : "Not Eligible for Vote";
        System.out.println(VoteRight);
    }
}
