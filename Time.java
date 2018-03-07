import java.util.*;
public class Time
{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=0;
            min=n%60;
            n=n/60;
            System.out.println(n+" "+min);
    }
}
