import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class database1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//1. Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1.Driver load done");
		//2.Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","root");
		System.out.println("2.Established connection with db done");
		
		//3.create sql statement
		Statement statement=con.createStatement();
		
		//4.submit the sql statement to database
		
		//1. create table
		String sqlquery="create table school(roll_no int,name varchar(125),mno varchar(255))";
		//statement.execute(sqlquery);
		System.out.println("Successful create table school");
		
		
		//2.insert query
		String sqlinsert="insert into school (roll_no,name,mno) values(3,'vinod','5826423')";
		statement.executeUpdate(sqlinsert);
		System.out.println("Insertion of record Complete");
		
		//3.delete query
		String sqldelete="delete from school where roll_no=1";
		statement.executeUpdate(sqldelete);
		System.out.println("Deletion of record done");
		
		//4.alter query
		String sqlalter="alter table school add address varchar(125)";
		//statement.execute(sqlalter);
		System.out.println("Alter of table done add col");
		
		String sqlaltermodify="alter table school modify mno varchar(255)";
		statement.execute(sqlaltermodify);
		System.out.println("Alter of table done modify col");
		
		String sqlalterdelete="alter table school drop mno";
		statement.execute(sqlalterdelete);
		System.out.println("Alter of table done drop col");
		
		 
		
		
		con.close();
		statement.close();
		
		
	
	
	}

}
