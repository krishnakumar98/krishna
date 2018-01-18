import java.util.*;
public class arr {
    public static void main(String args[]) {
        int i,n,flag=1;
        int a[]=new int[25];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of line");
        n=sc.nextInt();
        for(i=0;i<n;i++)
          a[i]=sc.nextInt();
        for(i=0;i<n;i++)
          System.out.println(a[i]+"\t"+i);
    }
}
