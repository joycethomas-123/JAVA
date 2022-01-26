import java.util.*;
public class Calculate
{
	public static void main(String[] args) {
	     
	     Scanner obj = new Scanner(System.in);
	     System.out.println("Enter a number: ");
	     int a = obj.nextInt();
	     
	     System.out.println("Enter a numbers: ");
	      int b = obj.nextInt();
	      
	      
	      calculate obj1 = new calculate();
	      obj1.factorial(a);
	      obj1.sum(b);
	     
	}
	
	void factorial(int a)
	{
	    int i,fact=1;
	     for (i=1;i<=a;i++)
	        fact = fact * i;
	     System.out.println("Factorial = "+fact);
	}
	void sum(int b)
	{
	    	     int sum =0,rem;
	     while(b!=0)
	     {
	         x = a%10;
	         sum = sum + rem;
	         b = b/10;
	  
	     }
	 
	     System.out.println("No of digits = "+sum);
	}
}

