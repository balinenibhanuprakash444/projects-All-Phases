
import java.sql.*;
import java.util.Scanner;
public class DemoTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database","root","Bhanusss@4");
		System.out.println("Database connected..");
		Scanner sc = new Scanner(System.in);
		//Statement stmt = con.createStatement();
		///int res = stmt.executeUpdate("insert into employee values(6,'Balaji',22000)");
		//if(res>0) {
		//System.out.println("Record inserted successfully");
		//}
		//delete query
		//int res = stmt.executeUpdate("delete from employee where id = 5");
		//if(res>0) {
		//System.out.println("Record deleted successfully");
		//}else {
		//System.out.println("Record not present");
		//}
		//}
		//update query
		//int res = stmt.executeUpdate("update employee set salary =35000 where id = 1");
		//if(res>0) {
			//System.out.println("Record updated successfully");
		//}else {
			//System.out.println("Record not present");
		//}
		//retrieve query
		//ResultSet rs = stmt.executeQuery("select * from employee");
		//while(rs.next()){
		//System.out.println("id is "+rs.getInt("id")+"Name is "+rs.getString("name")+"Salary is "+rs.getFloat("salary"));
			//System.out.println("id is "+rs.getInt(1)+"Name is "+rs.getString(2)+"Salary is "+rs.getFloat(3));
PreparedStatement pstmt = con.prepareStatement("select * from employee where id = ?");
System.out.println("Enter the id");
int id = sc.nextInt();
pstmt.setInt(1, id);
ResultSet rs = pstmt.executeQuery();
if(rs.next()) {
	System.out.println("id is "+rs.getInt(1)+"Name is "+rs.getString(2)+"Salary is "+rs.getFloat(3));

}else {
	System.out.println("Record not present");
}
            }catch(Exception e) {
			System.out.println(e);
		}

	}

}
