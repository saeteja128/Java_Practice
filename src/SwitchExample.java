import java.util.Scanner;
public class SwitchExample {
    public static void main(String[] args)
    {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch  (month)
        {
            case 1:
                System.out.println("Month: January");
                System.out.println("No of Days in January: 31");
                break;
            case 2:
                System.out.println("Month: February");
                System.out.println("No of Days in January: 28");
                break;
            case 3:
                System.out.println("Month: March");
                System.out.println("No of Days in March: 31");
                break;
            case 4:
                System.out.println("Month: April");
                System.out.println("No of Days in April: 30");
                break;
            case 5:
                System.out.println("Month: May");
                System.out.println("No of Days in May: 31");
                break;
            case 6:
                System.out.println("Month: June");
                System.out.println("No of Days in June: 30");
                break;
            case 7:
                System.out.println("Month: July");
                System.out.println("No of Days in July: 31");
                break;
            case 8:
                System.out.println("Month: August");
                System.out.println("No of Days in August: 31");
                break;
            case 9:
                System.out.println("Month: September");
                System.out.println("No of Days in September: 30");
                break;
            case 10:
                System.out.println("Month: October");
                System.out.println("No of Days in October: 31");
                break;
            case 11:
                System.out.println("Month: November");
                System.out.println("No of Days in November: 30");
                break;
            case 12:
                System.out.println("Month: December");
                System.out.println("No of Days in December: 31");
                break;
            default:
                System.out.println("Provided wrong Input");
        }
    }
}
