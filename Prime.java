import java.util.*;
class Prime
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number"):
    int n = sc.nextInt();
    int i,a=0;
    if(n==0 || n == 1)
    {
      System.out.println(n+"is not prime number");
    }
    else
    {
      for(i=2;i<=n/2;i++)
      {
        if(n%i==0)
        {
          System.out.println(n+" is not prime number");
        a=1;
          break;
        }
      }
      if(a==0)
      {
        System.out.println(n+" is a prime number");
      }
    }
  }
}
