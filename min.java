import java.util.*;

public class min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n,i,min,curr;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value for n");
    n=sc.nextInt();
    System.out.println("Enter the value");
    min=sc.nextInt();
    for(i=1;i<n;i++){
    System.out.println("Enter the value");
    curr=sc.nextInt();
    if(curr<min)
    	min=curr;
    }
	System.out.println("\nMinimum element is"+min);
	}

}
