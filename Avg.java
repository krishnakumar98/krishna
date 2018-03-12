import java.util.*;
public class Avg {
    public static void main(String args[]) {
        int n,i,s=0;
        int a[]=new int[20];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
          s=s+a[i];
        }
        
        System.out.println(s/n);
    }
}
