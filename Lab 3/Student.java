import java.util.*;
public class Student
{
	public static void main(String[] args) {
	    
	    Student obj1 = new Student();
	    obj1.enterdetails();
	    obj1.printdetails();
	    
	}
}
	class Student
	{
	    int rollno,i;
	    String name;
	   // String sub[] = new String[5];
	    int m[] = new int[5];
	    
	  void enterdetails()
	  {
	     Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the name of the Student: ");
	     name = sc.nextLine();
	    
	     System.out.println("Enter the rollno of the Student: ");
	     rollno = sc.nextInt();  
	      for(i=0;i<5;i++)
	    {
	       // System.out.println("Enter the subjects: ");
	         // sub[i] = sc.nextLine();
	          
	     System.out.println("Enter Marks : ");
	           m[i] = sc.nextInt();
	    }
	   
	  }
	  void printdetails()
	  {
	       
	    System.out.println("Name of the Student: "+name);
	   
	    
	     System.out.println("Rollno of the Student: "+rollno);
	     
	       for(i=0;i<5;i++)
	    {
	        //System.out.println("Subjects: "+ sub[i]);
	          
	     System.out.println(" Mark : "+ m[i]);
	           
	    }
	   
	    
	  }
	}


