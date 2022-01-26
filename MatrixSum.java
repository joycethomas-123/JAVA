import java.util.*;
public class MatrixSum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: \n");
		int n = sc.nextInt();
		
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int c[][]=new int[10][10];
		
		int i,j;
		
		System.out.println("Enter the elements to the first matrix:\n ");
		for(i=0;i<n;i++)
		for(j=0;j<n;j++)
		{
		    a[i][j] = sc.nextInt();
		}
		
		System.out.println("The first matrix:\n ");
		for(i=0;i<n;i++)
		for(j=0;j<n;j++)
		{
		   System.out.println(a[i][j]);
		}
		
		System.out.println("Enter the elements to the second matrix:\n ");
		for(i=0;i<n;i++)
		for(j=0;j<n;j++)
		{
		    b[i][j] = sc.nextInt();
		}
		
		System.out.println("The entered element second matrix:\n ");
		for(i=0;i<n;i++)
		for(j=0;j<n;j++)
		{
		  System.out.println(b[i][j]);  
		}
		
		System.out.println("Sum of the matrix:\n ");
		for(i=0;i<n;i++)
		for(j=0;j<n;j++)
		{
		  c[i][j] = a[i][j] + b[i][j];  
		}
		
		for(i=0;i<n;i++)
		for(j=0;j<n;j++)
		{
		  System.out.println(c[i][j]); 
		}
		
	}
}
