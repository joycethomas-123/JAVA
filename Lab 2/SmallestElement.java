import java.util.*;
class SmallestElement
{
  public static void main(String args[])
  {
    int i;
    System.out.println("Enter the elements present in the array");
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int a[]=new int[num];
    System.out.println("Enter the elements present in the array");
    for(i=0;i<num;i++)
    {
      a[i]=in.nextInt();
    }
    int small=a[0];
    for(i=0;i<num;i++)
    {
      if(a[i]<small)
      {
        small=a[i];
      }
    }
    System.out.println("Smallest element is "+small);
   }
 }
