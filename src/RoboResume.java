import java.util.Scanner;
public class RoboResume {
	
				Scanner sc = new Scanner(System.in);
				void print(){
			      
			      System.out.println("Please Enter First, Last Name :");
			      String name =  sc.nextLine();
			      
			      while(!name.matches("[a-zA-z]+([ '-][a-zA-Z]+)*"))
			      {
			    	  System.out.println("Please Retype name First, Last name ");
			    	  name =  sc.nextLine();
			      }
			    
			      System.out.println("Please Enter Email Address :");
			      String email =  sc.nextLine();
			      
			      while(!email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"))
			      {
			    	  System.out.println("Please Retype Email Address ");
			    	  email =  sc.nextLine();
			      }}}
			      
			      
		
			    		   
				   		 
				   		 // Displaying the information 
				   		/*System.out.println( "\n"+"\n"+"Name:"+name);
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
			    		}*/
			      
	

			
				

			
			

			

			   