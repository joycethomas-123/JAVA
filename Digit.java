import java.util.*;
class Digit
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number"):
    int n = sc.nextInt();
    int sum=0, a;
    for(;n>0;)
    {
      a=n%10;
      sum = sum+a;
      n = n/10;
    }
    System.out.println("Sum="+sum);
    }
    }
