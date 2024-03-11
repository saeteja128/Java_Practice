import java.util.Scanner;
public class ReplaceCharacters {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String A = sc.nextLine();
        String Result = "";
        int flag = 0;
        int size = A.length();
        System.out.println("Size of String:" +size);

        for(int i=0;i<size;i++)
        {
            A = A.replaceFirst(String.valueOf("m"),"").replaceFirst(String.valueOf("p"),"");
            A = A.replaceFirst(String.valueOf("a"),"").replaceFirst(String.valueOf("m"),"");
            Result = A;
            System.out.println(Result);
            if(Result.isEmpty())
            {
                flag++;
            }
        }
        if(flag>0)
        {
            System.out.println(1);;
        }
        else {
            System.out.println(0);
        }
    }

}
