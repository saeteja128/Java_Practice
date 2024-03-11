import java.util.Scanner;

public class TwoDArrays {

    public static void main(String[] args) {
        int rows = 2;
        int cols = 2;
        int a[][] = new int[rows][cols];
        int b[][] = new int[rows][cols];
        int c[][] = new int[rows][cols];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First matrix numbers from the console: ");

        System.out.println("Adding the Two matrix numbers");
        for (int k = 0; k < rows; k++) {
            for (int l = 0; l < cols; l++) {
                c[k][l] = a[k][l] + b[k][l];
            }
        }

        System.out.println("Printing the Result matrix numbers: ");
        for (int k = 0; k < rows; k++) {
            for (int l = 0; l < cols; l++) {
                System.out.print(c[k][l] + " ");
            }
            System.out.println();
        }


    }
}
