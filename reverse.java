import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
	  int n,r=0,n1;	
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a value");
      n=sc.nextInt();
      int t=n;
      while(n>0)
      {
    	  n1=n%10;
    	  n=n/10;
    	  r=r*10+n1;
      }
      System.out.println("The reverse no of "+t+" is "+r);
	sc.close();
	}

}
