import java.util.Scanner;
public class string {
	public static void main(String[] args) {
	  int n,i;
	  String str=new String();
      Scanner sc=new Scanner(System.in);
      str=sc.nextLine();
      n=sc.nextInt();
      for(i=0;i<n;i++)
      {
    	  System.out.println(str);
      }
      sc.close();
	}

}
