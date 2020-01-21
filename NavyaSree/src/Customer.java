import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Customer extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String cName=request.getParameter("cname");
		
		String address=request.getParameter("address");
		String state=request.getParameter("state");
		String s3=request.getParameter("custmobile");
		
		long cMobile=Long.parseLong(s3);
		
		String cemail=request.getParameter("custemail");
		String wayContact=request.getParameter("contact");
		String incident=request.getParameter("incident");
        String ss=request.getParameter("cname");
		String newName=ss.substring(0, 4);
		
		try {
		String date=request.getParameter("dateofvisit");
		System.out.println(date);
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date d=sdf.parse(date);
		java.sql.Date ds=new java.sql.Date(d.getTime());
		if(request.getParameter("submit").equals("submit")) {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//System.out.println("driver loaded");
		Connection cname=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		//System.out.println("Connection established");
		PreparedStatement ps=cname.prepareStatement("insert into customer values(?,?,?,?,?,?,?,?,?)");
		ps.setString(1,cName );
		
		ps.setString(2, address);
		ps.setString(3, state);
		ps.setLong(4,cMobile );
		ps.setString(5, cemail);
		ps.setString(6, wayContact);
		ps.setDate(7, ds);
		        ps.setString(8,incident );
		       // ps.setString(9, ns);
		int re=ps.executeUpdate();
		if(re>0)
		{
		cname.commit();
		PrintWriter out=response.getWriter();
		out.println("registration done "+cName);
	

		}}
	

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
