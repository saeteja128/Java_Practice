import java.util.Scanner;
public class LCM {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two integers: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int remA, remB, LCM=0;
        int divisor = 2;
        if(A%2==0 && B%2==0)
        {
            remA = A/2;
            remB = B/2;
            LCM = 2*remA*remB;
            System.out.println("LCM of " +A+ " and " +B+ " is " +LCM);
        }
        else if(A%2!=0 && B%2!=0)
        {
            LCM = A*B;
            System.out.println("LCM of " +A+ " and " +B+ " is " +LCM);
        }
        else if(A%2!=0 && B%2==0){
            System.out.println("In this else if");
            remB = B/2;
            LCM = 2*A*remB;
            System.out.println("LCM of " +A+ " and " +B+ " is " +LCM);
        }
        else if(A%2==0 && B%2!=0){
            System.out.println("In this else if");
            remA = A/2;
            LCM = 2*remA*remA;
            System.out.println("LCM of " +A+ " and " +B+ " is " +LCM);
        }

    }
}
