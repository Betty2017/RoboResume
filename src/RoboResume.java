import java.util.Scanner;
public class RoboResume {

	public static void main(String[] args) 
	{
			      Scanner sc = new Scanner(System.in);
			      System.out.println("Please Enter Full Name :");
			      String name =  sc.nextLine();
			      
			      System.out.println("Please Enter Email Address :");
			      String email =  sc.nextLine();
			      
			      System.out.println("Number of  Education Achivement :");
			      int numOfAchivement = sc.nextInt();
			     
			      
			      while(numOfAchivement < 1 || numOfAchivement>10) 
			      {
			    	  System.out.println("Please Enter Number of  Education Achivement Again:");  
			    	  numOfAchivement = sc.nextInt();
			      }//while end 

			      	     
		  		String edu[] = new String[numOfAchivement];
		  
		  		 for (int i = 0; i < edu.length; i++)
		  		{
		  			 System.out.println("Enter Education Achivement");
		  			 
		  		  edu[i] = sc.next();
		  		  sc.nextLine();
		  		}
			      
		  		 
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
		  		
			      
			      
			      System.out.println("Number of  Skills with Rating :");
			      int numOfSkills = sc.nextInt();
			      while(numOfSkills < 1 || numOfSkills>20) 
			      {
			    	  System.out.println("Please Enter Number of  Skills with Rating Again:");  
			    	  numOfSkills = sc.nextInt();
			      }
			       		
			    		
				    	String skill[] = new String[numOfSkills];
				   		
				   		
				   		 for (int i = 0; i < skill.length; i++)
				   		{
				   			System.out.println("Enter Skills with Rating:");
				   			skill[i] = sc.next();
				   			sc.nextLine();
				   			
				   		}
			    		   
				   		 
				   		 // Displaying the information 
				   		System.out.println( "\n"+"\n"+"Name:"+name);
				  		System.out.println("Email:"+ email+"\n");
				   		 
			    		System.out.println("Education Achivement:");
			    		for (int i = 0; i < edu.length; i++) 
			    		{
			    		    System.out.print(edu[i] + "\n"+"\n");
			    		}
			    		System.out.println("Work Experiences:");
			    		for (int i = 0; i < exp.length; i++) 
			    		{
			    		 System.out.print(exp[i] + "\n"+"\n");
			    		}

			    		System.out.println("Skills with Rating :");
			    		for (int i = 0; i < skill.length; i++) 
			    		{
			    		 System.out.print(skill[i] + "\n"+"\n");
			    		}
			      
			   }
			}
				

			
			

			

			   