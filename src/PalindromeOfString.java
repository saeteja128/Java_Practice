public class PalindromeOfString {
    public static void main(String[] args)
    {
        String str = new String("Sai Teja");
        String temp = str;
        String rev = new String("");
        for(int i=str.length()-1;i>=0;i--)
        {
            rev = rev+str.charAt(i);
        }
        if(rev.equals(temp))
        {
            System.out.println("Given String is Palindrome");
        }
        else {
            System.out.println("Not a Palindrome String");
        }

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String r = sb.toString();
        System.out.println(r);
    }
}
