import java.util.Scanner;
public class MethodOverloading {
    static int add(int a, int b)
    {
        return a+b;
    }
    static String add(String c, String d)
    {
        return c+d;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer Numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
//        System.out.println("Enter the String Values:");
//        String s1 = sc.nextLine();
//        System.out.println("Enter the String Values:");
//        String s2 = sc.nextLine();
        System.out.println(add(num1, num2));
        System.out.println(add("Hello", " Sai Teja"));

    }

}
