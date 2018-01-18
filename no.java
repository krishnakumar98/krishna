import java.util.*;
public class no {
    public static void main(String args[]) {
        String str;
        int n,flag=1;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        n=str.length();
        for(int i=0;i<n;i++)
           if(!(Character.isDigit(str.charAt(i))))
           {
               flag=0;
               break;
           }
        if(flag==1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
