import java.util.Scanner;

public class Experience {
	void experience(){ 
	      
	       Scanner sc = new Scanner(System.in);
 		 
	     System.out.println("Number of Work Experiences:");
	      int numOfexperiences = sc.nextInt();
	      
	      while (numOfexperiences < 0 || numOfexperiences>10)
	      {
	    	  System.out.println("Please Enter Number of Work Experiences Again:");  
	    	  numOfexperiences = sc.nextInt();
	      }
	      	String exp[] = new String[numOfexperiences];
 			
 			for (int i = 0; i < exp.length; i++)
 		{
 			System.out.println("Enter Work Experiences:");
 		   exp[i] = sc.next();
 		   sc.nextLine();
 		   
 		}	
 		
	      
 			System.out.println("Work Experiences:");
   		for (int i = 0; i < exp.length; i++) 
   		{
   		 System.out.print(exp[i] + "\n"+"\n");
   		}  
	}
}
	     

