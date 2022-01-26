import java.util.*;
class palindrome
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number"):
    int n = sc.nextInt();
    int sum=0, temp = n, a;
    for(;n>0;)
    {
      a=n%10;
      sum = (sum*10)+a;
      n = n/10;
    }
    if (temp==sum)
    {
      System.out.println(" A palindrome number");
    }
    else
    {
      System.out,println("Not a palindrome");
    }
    
