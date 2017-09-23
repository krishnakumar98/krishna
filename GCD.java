import java.util.Scanner;
public class GCD {
	static int gcd(int x,int y)
	{
		int temp,r;
		if(x<y)
		{
			temp=x;
			x=y;
			y=temp;
		}
		r=x%y;
		if(r==0)
			return y;
		else
		{	
		x=y;
		y=r;
		gcd(x,y);
		}
		return y;
		    
		
	}
	public static void main(String[] args) {
	int t,a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter two values");
	a=sc.nextInt();
	b=sc.nextInt();
	t=gcd(a,b);
	System.out.println("the HCF of "+a+" and "+b+" is "+t);
	sc.close();
	}
}
