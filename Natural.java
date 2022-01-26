import java.util.*; 
public class Natural
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int i,sum=0;
		for(i=0;i<=n;i++)
		{
		    sum = sum + i;
		}
		System.out.println("Sum = "+ sum);
	}
}
