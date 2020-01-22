import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StudentReg")
public class StudentReg extends HttpServlet {
private static final long serialVersionUID = 1L;
     
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
String s1=request.getParameter("studid");
int studId=Integer.parseInt(s1);
String studName=request.getParameter("studname");
String s2=request.getParameter("studmarks");
int studMarks=Integer.parseInt(s2);
String address=request.getParameter("studaddress");
String s3=request.getParameter("studmobile");
long studMobile=Long.parseLong(s3);
String studEmail=request.getParameter("studemail");
String password=request.getParameter("password");
try {
String date=request.getParameter("studdob");
System.out.println(date);
SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
java.util.Date d=sdf.parse(date);
java.sql.Date ds=new java.sql.Date(d.getTime());
 
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection cname=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
PreparedStatement ps=cname.prepareStatement("insert into student values(?,?,?,?,?,?,?,?)");
ps.setString(2,studName );
ps.setInt(1,studId );
ps.setInt(3,studMarks );
ps.setString(4, address);
ps.setLong(5,studMobile );
ps.setString(6, studEmail);
ps.setDate(7, ds);
        ps.setString(8, password);
int result=ps.executeUpdate();
if(result>0)
{
    cname.commit();
    PrintWriter out=response.getWriter();
    out.println("registration done "+studName);
    
}
 
}
catch(ClassNotFoundException c)
{
    System.out.println(c);
}
catch(SQLException s)
{
    System.out.println(s);
}
catch(ParseException p)
{
System.out.println(p);
}
 
}
}
