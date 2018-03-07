import java.util.*;
public class Countspace
{
    public static void main(String args[])
    {   int count=0;
        Scanner sc=new Scanner(System.in);
        String str=new String();
        str=sc.nextLine();
        int l=str.length();
        for(int i=0;i<l;i++)
        { String a=str.substring(i,i+1);
        if(a.equals(" "))
        {
            count++;
        }
        }
        
        System.out.println(count);
    }
}
