import java.util.Scanner;
public class doWhile {
    public static void main(String[] args)
    {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        do{
            System.out.println(n);
            n--;
        }while(n>0);
    }
}
