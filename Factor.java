import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = obj.nextInt();
		int i;
		for(i=1;i<=n;i++)
		{
		    if((n%i)==0)
		    {
		        System.out.println("Factor = "+i);
		    }
		    }
	}
}
