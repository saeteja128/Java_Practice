import java.util.Scanner;
public class forEach {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array nummbers: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to find in the array: ");
        int key = sc.nextInt();
        boolean found = false;
        for(int num: arr)
        {
            if(num == key){
                found = true;
            }
        }
        if(found)
        {
            System.out.println("Number Found");
        }
        else{
            System.out.println("Not Found");
        }

    }
}
