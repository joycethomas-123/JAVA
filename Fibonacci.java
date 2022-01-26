import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = obj.nextInt();
		int i,a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		for(i=2;i<=n;i++)
		{
		    c = a + b;
		    System.out.println(c);
		    a = b;
		    b = c;
		}
	}
}
