import java.util.Scanner;

public class Education {
	private	int numEdu;
	private	String eduDes;
	
public int getNumEdu() {
		return numEdu;
	}

	public void setNumEdu(int numEdu) {
		this.numEdu = numEdu;
	}

	public String getEduDes() {
		return eduDes;
	}

	public void setEduDes(String eduDes) {
		this.eduDes = eduDes;
	}



public void education()

{	
	Scanner sc= new Scanner(System.in);
	System.out.println("Number of  Education Achivement :");
    int numOfAchivement = sc.nextInt();

	 while(numOfAchivement < 1 || numOfAchivement>10) 
     {
   	  System.out.println("Please Enter Number of  Education Achivement Again:");  
   	  numOfAchivement = sc.nextInt();
     }//while end 

     	     
	//	String edu[] = new String[numOfAchivement];

	//	 for (int i = 0; i < edu.length; i++)
	//	{
			 System.out.println("Enter Education Achivement");
			 String edu = sc.nextLine();
			 setEduDes(edu);
		}
}
