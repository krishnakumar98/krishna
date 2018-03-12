import java.util.*;
public class Sum{
    public static void main(String args[]) {
        int n,n1,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
         n1=n%10;
         n=n/10;
          s=s+n1;
        }
        
        System.out.println(s);
    }
}
