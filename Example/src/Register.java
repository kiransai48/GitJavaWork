import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class Register extends HttpServlet
{  
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
     {  
          response.setContentType("text/html");  
          PrintWriter out = response.getWriter();  
          
          String name = request.getParameter("userName");  
          String pwd = request.getParameter("userPass");  
          String email = request.getParameter("userEmail");
          String mobile = request.getParameter("userMobile");
          String dob = request.getParameter("userDOB");  
          String gender = request.getParameter("gender");  
          String country =request.getParameter("userCountry");  
          
          try
          {  
               //load the driver
               Class.forName("oracle.jdbc.driver.OracleDriver");  
               //create connection object
               Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","saikiran","kiran");  
               // create the prepared statement object
               PreparedStatement ps=con.prepareStatement("insert into registration values(?,?,?,?,?,?,?)");  
  
               ps.setString(1,name);  
               ps.setString(2,pwd);  
               ps.setString(3,email);  
               ps.setString(4, mobile);
               ps.setString(5,dob);  
               ps.setString(6,gender);  
               ps.setString(7,country);  
  
               int i = ps.executeUpdate();  
               if(i>0)  
               out.print("You are successfully registered...");  
  
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }  
          out.close();  
     }  
}