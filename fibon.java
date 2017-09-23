import java.util.Scanner;
public class fibon {

	public static void main(String[] args) {
	  int i,a=-1,b=1,c,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("\nEnter a value for fibonacci sequence");
      n=sc.nextInt();
      for(i=0;i<n;i++)
      {
    	  c=a+b;
    	  System.out.println(c);
    	  a=b;
    	  b=c;			  
      }
      sc.close();
	}

}
