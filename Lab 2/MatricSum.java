
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	
	System.out.println("Enter a number: ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a[][]=new int[10][10];
	int i;int j;
	int max=a[0][0];
	
	for(i=0;i<n;i++)
	{
	    
	for(j=0;j<n;j++)
	{
	    System.out.println("Enter the elements: ");
	    a[i][j] = sc.nextInt();
	}
	}
	 System.out.println("The elements:\n");
	for(i=0;i<n;i++)
	{
	    
	for(j=0;j<n;j++)
	{
	    System.out.println(a[i][j]);
	    
	    
	}
	
	}
	for(i=0;i<n;i++)
	{
for(j=0;j<n;j++)
	{
//	i=0;j=0;
	if(a[i][j] > max)
	
	    max = a[i][j];
	   // 
	
   }
	}
	System.out.println("The largest number in this matrix is:"+ max);
	}
}
