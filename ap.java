import java.util.*;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n,a,d,val=0;
		Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=sc.nextInt();
        d=sc.nextInt();
        val=(n*(2*a+(n-1)*d))/2;
        System.out.println(val);
        
	}

}
