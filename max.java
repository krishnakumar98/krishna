import java.util.*;

public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n,i,max,curr;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value for n");
    n=sc.nextInt();
    System.out.println("Enter the value");
    max=sc.nextInt();
    for(i=1;i<n;i++){
    System.out.println("Enter the value");
    curr=sc.nextInt();
    if(curr>max)
    	max=curr;
    }
	System.out.println("\nMaximum element is"+max);
	}

}
