
	import java.util.Scanner;

	public class Skill {
		private	int numSki;
		private	String SkillDes;
	
		public int getNumSki() {
			return numSki;
		}

		public void setNumSki(int numSki) {
			this.numSki = numSki;
		}

		public String getSkillDes() {
			return SkillDes;
		}

		public void setSkillDes(String skillDes) {
			SkillDes = skillDes;
		}





	public void skills()

	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("Number of  Skills with Rateing :");
	    int numOfSkills = sc.nextInt();

		 while(numOfSkills < 1 || numOfSkills>10) 
	     {
	   	  System.out.println("Please Enter Number of  Education Achivement Again:");  
	   	numOfSkills = sc.nextInt();
	     }//while end 

	     	     
		//	String edu[] = new String[numOfAchivement];

		//	 for (int i = 0; i < edu.length; i++)
		//	{
				 System.out.println("Enter Education Achivement");
				 String skill = sc.nextLine();
				 setSkillDes(skill);
			}
	}


