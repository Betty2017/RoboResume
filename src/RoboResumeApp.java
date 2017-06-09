import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RoboResumeApp {

	public static void main(String[] args) {
		
		RoboResume ro = new RoboResume();
		Experience ex = new Experience();
		Education ed = new Education();
		Skill sk = new Skill();
		ro.print();
		String name=ro.getName();
		String email=ro.getEmail();
		ed.education();
		String edDes = ed.getEduDes();
		ex.experience();
		String description = ex.getExpDes();
		int num = ex.getNumExp();
		sk.skills();
		String skillDes = sk.getSkillDes();
	    addResume(name,email,edDes,description,skillDes);
		System.out.println(name+ email + " " + description);

	}
	public static void addResume(String name, String email, String eduDes, String expDes, String skillDes)
	{		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String sql = "Insert into RoboResume(Name, Email,EduDes,ExpDes,SkillDes) values('"
				+name+"','"+email+"','"+eduDes+"','"+expDes+"','"+skillDes+"')";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/robo?"
                                + "user=root&password=Password1");
			stmt = con.createStatement();
			 if(!stmt.execute(sql))
			 {
				 
				
				sql= "Select * from RoboResume where Name='"+name+"' and Email='"+email+"'";
				stmt=con.createStatement();
				rs=stmt.executeQuery(sql);
				
				while(rs.next()){
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2));
					System.out.println();
				}
			}
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

}
