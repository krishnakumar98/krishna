import java.util.*;

public class Timesub
{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int n,min;
        int t1=sc.nextInt();
        int min1=sc.nextInt();
        int t2=sc.nextInt();
        int min2=sc.nextInt();
        int time1=t1*60+min1;
        int time2=t2*60+min2;
        n=Math.abs(time2-time1);
            min=n%60;
            n=n/60;
            System.out.println(n+" "+min);
    }
}
