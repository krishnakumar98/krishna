import java.util.*;
public class MinMax {
    public static void main(String args[]) {
        int n,i,max,min;
        int a[]=new int[20];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        max=min=a[0];
        for(i=1;i<n;i++)
        {
            if(max<a[i])
              {
                  max=a[i];
              }
             if(min>a[i])
             {
                 min=a[i];
             }
        }
        System.out.println(min+"\t"+max);
    }
}
