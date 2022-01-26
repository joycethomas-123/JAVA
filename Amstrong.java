import java.util.*;
class Amstrong
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
      sum = sum+(a*a*a);
      n = n/10;
    }
    if (temp==sum && temp>0)
    {
      System.out.println(" An amstrong number");
    }
    else
    {
      System.out,println("Not an amstrong");
    }
    }
    }
