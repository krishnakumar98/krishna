import java.util.*;
public class Maxi {
    public static void main(String args[]) {
        int a[]=new int[10];
        int i,max;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        max=a[0];
        for(i=1;i<10;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
