import java.util.*;
public class Countno
{
    public static void main(String args[])
    {   int count=0;
        Scanner sc=new Scanner(System.in);
        String str=new String();
        str=sc.nextLine();
        int l=str.length();
        for(int i=0;i<l;i++)
        { char a=str.charAt(i);
        if(Character.isDigit(a))
        {
            count++;
        }
        }
        System.out.println(count);
    }
}
