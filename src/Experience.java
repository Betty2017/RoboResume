import java.util.Scanner;

	public class Experience 
		{
		private	int numExp;
		private	String expDes;
		
		public int getNumExp() {
			return numExp;
		}

		public void setNumExp(int numExp) {
			this.numExp = numExp;
		}

		public String getExpDes() {
			return expDes;
		}

		public void setExpDes(String expDes) {
			this.expDes = expDes;
		}
	
			public void experience()
			{ 
	      		Scanner sc = new Scanner(System.in);
 		 
	      		System.out.println("Number of Work Experiences:");
	      		String numOfexperiences = sc.nextLine();
	      		int num=0;
	      		while(!numOfexperiences.matches("[-+]?\\d*\\.?\\d+"))
	      		{
	      			System.out.println("Please Retype Number of Work Experiences ");
	      			numOfexperiences =  sc.nextLine();
	      			num= Integer.parseInt(numOfexperiences);
	      		}
	      		
	      		
	      		while (num < 0 || num>10)
	      		{
	      			System.out.println("Please Enter Number of Work Experiences Again:");  
	      			num = sc.nextInt();
	      		}
	      		
	      		//String exp = new String[num];
	      		
 			
	      		//for (int i = 0; i < exp.length; i++)
	      	//	{
	      			System.out.println("Enter Work Experiences:");
	      			String exp = sc.nextLine();
	      			//sc.nextLine();
	      			setExpDes(exp);
	      			
					//return exp;
 		   
	      		}	
 		
	      		/*System.out.println("Work Experiences:");
	      		for (int i = 0; i < exp.length; i++) 
	      		{
	      			System.out.print(exp[i] + "\n"+"\n");
	      		}*/  
			}


	     

