import java.util.Scanner;
public class SwitchExample2 {
    public static void main(String[] args)
    {
        System.out.println("Enter the alphabet");
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.nextLine().charAt(0);
        switch (alphabet)
        {
            case 'a','e','i','o','u' -> System.out.println("It is an Vowel");

            default -> System.out.println("It is a Consonant");
        }


    }
}
